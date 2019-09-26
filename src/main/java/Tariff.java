public class Tariff {

    int id;
    String name;
    boolean withoutSubscriptionFee;
    boolean unlimTraffic;
    boolean unlimMessengers;
    boolean unlimInternetAbroad;
    int volumeOfMinutes;
    boolean umnlimMinutesOnTele2;
    int volumeOfSms;
    int tariffPaymentOnRubles;
    public Payment payment;
    int trafficVolume;
    public Traffic traffic;
}

    enum Payment {
        onMonth,
        onDay
    }

    enum Traffic {
        gigabyte,
        megabyte
    }