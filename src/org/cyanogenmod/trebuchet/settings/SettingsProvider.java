/*
 * Copyright (C) 2013 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cyanogenmod.trebuchet.settings;

import android.content.Context;
import android.content.SharedPreferences;

public final class SettingsProvider {
    public static final String SETTINGS_KEY = "org.cyanogenmod.trebuchet_preferences";

    public static final String SETTINGS_CHANGED = "settings_changed";

    public static final String SETTINGS_UI_HOMESCREEN_DEFAULT_SCREEN_ID = "ui_homescreen_default_screen_id";
    public static final String SETTINGS_UI_HOMESCREEN_SEARCH = "ui_homescreen_search";
    public static final String SETTINGS_UI_HOMESCREEN_SCROLLING_WALLPAPER_SCROLL = "ui_homescreen_scrolling_wallpaper_scroll";
    public static final String SETTINGS_UI_HOMESCREEN_SCROLLING_PAGE_OUTLINES = "ui_homescreen_scrolling_page_outlines";
    public static final String SETTINGS_UI_GENERAL_LARGE_ICONS = "ui_general_large_icons";

    public static SharedPreferences get(Context context) {
        return context.getSharedPreferences(SETTINGS_KEY, 0);
    }

    public static int getIntCustomDefault(Context context, String key, int def) {
        return get(context).getInt(key, def);
    }

    public static int getInt(Context context, String key, int resource) {
        return getIntCustomDefault(context, key, context.getResources().getInteger(resource));
    }

    public static long getLongCustomDefault(Context context, String key, long def) {
        return get(context).getLong(key, def);
    }

    public static long getLong(Context context, String key, int resource) {
        return getLongCustomDefault(context, key, context.getResources().getInteger(resource));
    }

    public static boolean getBooleanCustomDefault(Context context, String key, boolean def) {
        return get(context).getBoolean(key, def);
    }

    public static boolean getBoolean(Context context, String key, int resource) {
        return getBooleanCustomDefault(context, key, context.getResources().getBoolean(resource));
    }

    public static String getStringCustomDefault(Context context, String key, String def) {
        return get(context).getString(key, def);
    }

    public static String getString(Context context, String key, int resource) {
        return getStringCustomDefault(context, key, context.getResources().getString(resource));
    }
}
