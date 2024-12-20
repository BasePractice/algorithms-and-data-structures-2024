package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

class DateFormatValidator extends DateValidator {
    private static final String PATTERN =
            "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/"
                    + "(19\\d\\d|20\\d\\d|21\\d\\d|22\\d\\d|23\\d\\d|24\\d\\d|"
                    + "25\\d\\d|26\\d\\d|27\\d\\d|28\\d\\d|29\\d\\d|30\\d\\d|"
                    + "31\\d\\d|32\\d\\d|33\\d\\d|34\\d\\d|35\\d\\d|36\\d\\d|"
                    + "37\\d\\d|38\\d\\d|39\\d\\d|40\\d\\d|41\\d\\d|42\\d\\d|"
                    + "43\\d\\d|44\\d\\d|45\\d\\d|46\\d\\d|47\\d\\d|48\\d\\d|"
                    + "49\\d\\d|50\\d\\d|51\\d\\d|52\\d\\d|53\\d\\d|54\\d\\d|"
                    + "55\\d\\d|56\\d\\d|57\\d\\d|58\\d\\d|59\\d\\d|60\\d\\d|"
                    + "61\\d\\d|62\\d\\d|63\\d\\d|64\\d\\d|65\\d\\d|66\\d\\d|"
                    + "67\\d\\d|68\\d\\d|69\\d\\d|70\\d\\d|71\\d\\d|72\\d\\d|"
                    + "73\\d\\d|74\\d\\d|75\\d\\d|76\\d\\d|77\\d\\d|78\\d\\d|"
                    + "79\\d\\d|80\\d\\d|81\\d\\d|82\\d\\d|83\\d\\d|84\\d\\d|"
                    + "85\\d\\d|86\\d\\d|87\\d\\d|88\\d\\d|89\\d\\d|90\\d\\d|"
                    + "91\\d\\d|92\\d\\d|93\\d\\d|94\\d\\d|95\\d\\d|96\\d\\d|"
                    + "97\\d\\d|98\\d\\d|99\\d\\d)$";

    public DateFormatValidator(String inputDate) {
        super(inputDate);
    }

    @Override
    public boolean isValid() {
        Pattern pattern = Pattern.compile(PATTERN);
        return pattern.matcher(inputDate).matches();
    }
}
