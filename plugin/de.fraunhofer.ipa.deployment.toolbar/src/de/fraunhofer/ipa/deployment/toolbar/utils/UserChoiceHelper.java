package de.fraunhofer.ipa.deployment.toolbar.utils;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class UserChoiceHelper {
  public static boolean WaitForUserChoice(String folder_name) {
      Display display = Display.getDefault();
      boolean createdDisplay = false;
      AtomicBoolean createdShell = new AtomicBoolean(false); // AtomicBoolean for shell creation tracking


      // If no Display is running, create one
      if (display == null) {
          display = new Display();
          createdDisplay = true;
      }

      // Use an array to store the result so it can be modified within the Runnable
      final boolean[] userChoice = new boolean[1];
      final Display finalDisplay = display;
      // Run the UI code in the UI thread using syncExec (so it doesn't block the background thread)
      display.syncExec(new Runnable() {
          @Override
          public void run() {
              // Create a shell and message box in the UI thread
            Shell shell = finalDisplay.getActiveShell();
               if (shell == null || !shell.isVisible()) {
                   // Create a new shell if no active shell is found
                 shell = new Shell(finalDisplay, SWT.NO_FOCUS | SWT.SHELL_TRIM);
                   createdShell.set(true);
               }

              MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
              messageBox.setText("Confirmation Required");
              messageBox.setMessage("The folder " + folder_name + " already exists. Do you want to delete it?");

              // Get the user's decision
              int result = messageBox.open();

              // Store the result in the array for returning later
              userChoice[0] = result == SWT.OK;

              // Dispose of the shell after use (but NOT the display)
              if (createdShell.get()) {
                  shell.dispose();
              }
          }
      });

      // Dispose of the display if we created a new one
      if (createdDisplay) {
          display.dispose();
      }

      // Return the user choice after syncExec finishes
      return userChoice[0];
  }

  public static String chooseDirectory() {
      Display display = Display.getDefault();
      boolean createdDisplay = false;
      AtomicBoolean createdShell = new AtomicBoolean(false); // AtomicBoolean for shell creation tracking


      // If no Display is running, create one
      if (display == null) {
          display = new Display();
          createdDisplay = true;
      }

      // Use an array to store the result so it can be modified within the Runnable
      final String[] selectedDirectory = new String[1];
      final Display finalDisplay = display;
      // Run the UI code in the UI thread using syncExec (so it doesn't block the background thread)
      display.syncExec(new Runnable() {
          @Override
          public void run() {
              // Create a shell and message box in the UI thread
            Shell shell = finalDisplay.getActiveShell();
               if (shell == null || !shell.isVisible()) {
                   // Create a new shell if no active shell is found
                 shell = new Shell(finalDisplay, SWT.NO_FOCUS | SWT.SHELL_TRIM);
                   createdShell.set(true);
               }
              DirectoryDialog directoryDialog = new DirectoryDialog(shell, SWT.OPEN);
              directoryDialog.setText("Select Local Directory");
              directoryDialog.setMessage("Please select a directory to import the repository:");

              // Opens dialog and returns the selected path
              selectedDirectory[0] = directoryDialog.open();

              if (createdShell.get()) {
                  shell.dispose();
              }
          }
      });

      // Dispose of the display if we created a new one
      if (createdDisplay) {
          display.dispose();
      }

      return selectedDirectory[0]; // Return the selected path
  }

  public static String[] getGitCredentials(String url) {
      Display display = Display.getDefault();
      boolean createdDisplay = false;
      AtomicBoolean createdShell = new AtomicBoolean(false); // AtomicBoolean for shell creation tracking

      // If no Display is running, create one
      if (display == null) {
          display = new Display();
          createdDisplay = true;
          System.out.println("Created a new Display for Git credentials dialog.");
      }

      // Use an array to store the credentials
      final String[] credentials = new String[3];
      final Display finalDisplay = display;

      // Run the UI code in the UI thread using syncExec (so it doesn't block the background thread)
      display.syncExec(new Runnable() {
          @Override
          public void run() {
              // Create a shell in the UI thread
              Shell shell = finalDisplay.getActiveShell();
              if (shell == null || !shell.isVisible()) {
                  // Create a new shell if no active shell is found
                  shell = new Shell(finalDisplay, SWT.NO_FOCUS | SWT.SHELL_TRIM);
                  createdShell.set(true); // Set to true
                  System.out.println("Created a new shell for Git credentials dialog.");
              }

              // Create custom dialog for Git credentials
              GitCredentialsDialog dialog = new GitCredentialsDialog(shell, url);
              int returnCode = dialog.open();  // Open the dialog and wait for user input

              // Process user input if OK is pressed
              if (returnCode == Window.OK) {
                  String username = dialog.getUsername();
                  String password = dialog.getPassword();
                  String token = dialog.getToken();

                  // Decide which authentication method is used (password or token)
                  if (!password.isEmpty()) {
                      credentials[0] = username;
                      credentials[1] = password;
                      credentials[2] = "password"; // Authentication type: password
                  } else if (!token.isEmpty()) {
                      credentials[0] = "";  // No username needed for token-based authentication
                      credentials[1] = token;
                      credentials[2] = "token";  // Authentication type: token
                  }
              }

              // Dispose of the shell if it was created
              if (createdShell.get()) {
                  shell.dispose();
              }
          }
      });

      // Dispose of the display if we created a new one
      if (createdDisplay) {
          display.dispose();
      }

      // Return the credentials array if valid; otherwise, return null
      return (credentials[1] != null && !credentials[1].isEmpty()) ? credentials : null;
  }

    // A custom dialog to get credentials from the user
  static class GitCredentialsDialog extends Dialog {
      private String username;
      private String password;
      private String token;
      private String repoUrl;
      private int returnCode;  // Return code for OK/CANCEL
      boolean createdDisplay = false;

      public GitCredentialsDialog(Shell parentShell, String repoUrl) {
          super(parentShell);
          this.repoUrl = repoUrl;
      }

      public String getUsername() {
          return username;
      }

      public String getPassword() {
          return password;
      }

      public String getToken() {
          return token;
      }

      @Override
      protected void configureShell(Shell newShell) {
          super.configureShell(newShell);
          newShell.setText("Git Credentials");
      }

      public int open() {
          Shell shell = new Shell(getParentShell(), SWT.SHELL_TRIM | SWT.MODELESS);
          shell.setText("Git Credentials");

          GridLayout layout = new GridLayout(2, false);
          shell.setLayout(layout);

          // Label for the repo URL
          Label urlLabel = new Label(shell, SWT.NONE);
          urlLabel.setText("Repository URL:");

          Text urlText = new Text(shell, SWT.BORDER);
          urlText.setText(repoUrl);
          urlText.setEditable(false);
          urlText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

          // Label and text box for username
          Label usernameLabel = new Label(shell, SWT.NONE);
          usernameLabel.setText("Username:");

          Text usernameText = new Text(shell, SWT.BORDER);
          usernameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

          // Label and text box for password
          Label passwordLabel = new Label(shell, SWT.NONE);
          passwordLabel.setText("Password:");

          Text passwordText = new Text(shell, SWT.BORDER | SWT.PASSWORD);
          passwordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

          // Label and text box for token
          Label tokenLabel = new Label(shell, SWT.NONE);
          tokenLabel.setText("Token:");

          Text tokenText = new Text(shell, SWT.BORDER | SWT.PASSWORD);
          tokenText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

          // Buttons for OK and Cancel
          Button okButton = new Button(shell, SWT.PUSH);
          okButton.setText("OK");
          okButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));

          Button cancelButton = new Button(shell, SWT.PUSH);
          cancelButton.setText("Cancel");
          cancelButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));

          okButton.addListener(SWT.Selection, event -> {
              username = usernameText.getText();
              password = passwordText.getText();
              token = tokenText.getText();
              returnCode = Window.OK; // Set return code for OK
              shell.close();
          });

          cancelButton.addListener(SWT.Selection, event -> {
              returnCode = Window.CANCEL; // Set return code for Cancel
              shell.close();
          });

          Display display = getParentShell().getDisplay();

          if (display == null) {
                display = new Display();
                createdDisplay = true;
            }

          final Display finalDisplay = display;

          // Run the UI code in the UI thread using syncExec (so it doesn't block the background thread)
          display.asyncExec(() -> {
              shell.pack(); // Pack the shell on the UI thread
              shell.open(); // Open the shell on the UI thread
          });
          while (!shell.isDisposed()) {
                if (!display.readAndDispatch()) {
                    display.sleep();
                }
            }

          return returnCode; // Return OK or CANCEL
      }
  }

  public static void ShowMessageDialog(String title, String message, int iconStyle) {
      Display display = Display.getDefault();
      boolean createdDisplay = false;
      AtomicBoolean createdShell = new AtomicBoolean(false); // AtomicBoolean for shell creation tracking

      // If no Display is running, create one
      if (display == null) {
          display = new Display();
          createdDisplay = true;
          System.out.println("Created a new Display for showMessageDialog.");
      }

      final Display finalDisplay = display;

      // Run the UI code in the UI thread using syncExec (so it doesn't block the background thread)
      display.syncExec(new Runnable() {
          @Override
          public void run() {
              // Create a shell in the UI thread
              Shell shell = finalDisplay.getActiveShell();
              if (shell == null || !shell.isVisible()) {
                  // Create a new shell if no active shell is found
                  shell = new Shell(finalDisplay, SWT.NO_FOCUS | SWT.SHELL_TRIM);
                  createdShell.set(true); // Set to true
                  System.out.println("Created a new shell for message dialog.");
              }

              MessageBox messageBox = new MessageBox(shell, iconStyle | SWT.OK);
              messageBox.setText(title);
              messageBox.setMessage(message);
              messageBox.open();

              // Dispose of the shell if it was created
              if (createdShell.get()) {
                  shell.dispose();
              }
          }
      });

      // Dispose of the display if we created a new one
      if (createdDisplay) {
          display.dispose();
      }
  }

}
