package com.bms.resourcebundle;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ExampleControl extends ResourceBundle.Control {

    @Override
    public List<Locale> getCandidateLocales(String s, Locale locale) {
        return Arrays.asList(new Locale("pl", "PL"));
    }

}
