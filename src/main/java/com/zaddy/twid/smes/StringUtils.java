package com.zaddy.twid.smes;

import net.minecraft.util.StatCollector;

public class StringUtils {
    public static String translate(String unlocalized, boolean prefix) {
        return prefix ? StatCollector.translateToLocal("twid." + unlocalized) : StatCollector.translateToLocal(unlocalized);
    }
    public static String translate(String unlocalized) {
        return translate(unlocalized, true);
    }
}