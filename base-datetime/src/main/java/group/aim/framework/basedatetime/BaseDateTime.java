package group.aim.framework.basedatetime;

import java.util.Date;

/**
 * Created by ponlavitlarpeampaisarl on 2/4/15 AD.
 */
public class BaseDateTime extends Date {
    public BaseDateTime(String unixTime) {
        this(unixTime , true);
    }

    public BaseDateTime(String unixTime , boolean isUseMillisec) {
        if (unixTime != null)
            setTime(Long.parseLong(unixTime) * (isUseMillisec ? 1 : 1000));
    }

    public BaseDateTime(long unixTime) {
        this((unixTime + "").length() > 10 ? (unixTime + "").substring(0, 10) : unixTime + "");
    }

    public BaseDateTime() {
        super();
    }

    public String toUnixTimeString() {
        return getTime() + "";
    }

}
