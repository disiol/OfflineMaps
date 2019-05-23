package com.denisimusit.offlineMaps.util;

import org.jetbrains.annotations.NotNull;

public class StringsUtill {



   @NotNull
   static public String firstUpperCase(String word) {
        if(word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
