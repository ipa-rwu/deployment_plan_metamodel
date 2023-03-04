#!/bin/bash

function replace_extention {
    local ori_ext=$1
    local replace_ext=$2
    local location=$3
    all="$(find "$location" -depth -name "*.$ori_ext")"
    for i in $all;
    do
        tmp=${i%."$ori_ext"}."$replace_ext"
        mv -- "$i" "$tmp"
    done;
}

replace_extention rossystem rossystem.yaml example
replace_extention planros planros.yaml example
replace_extention impl impl.yaml example
replace_extention tarEnv tarEnv.yaml example
replace_extention plan plan.yaml example


pre-commit run --files example/**/*

replace_extention rossystem.yaml rossystem example
replace_extention planros.yaml planros example
replace_extention impl.yaml impl example
replace_extention tarEnv.yaml tarEnv example
replace_extention plan.yaml plan example
