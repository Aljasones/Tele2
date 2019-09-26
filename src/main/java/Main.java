public class Main {

    public static void main(String[] args) {

        Tariff myOnline = new Tariff();
        myOnline.id = 1;
        myOnline.name = "Мой Онлайн";
        myOnline.unlimMessengers = true;
        myOnline.volumeOfMinutes = 400;
        myOnline.umnlimMinutesOnTele2 = true;
        myOnline.tariffPaymentOnRubles = 290;
        myOnline.payment = Payment.onMonth;
        myOnline.trafficVolume = 15;
        myOnline.traffic = Traffic.gigabyte;


        Tariff myOnline2 = new Tariff();
        myOnline2.id = 2;
        myOnline2.name = "Мой Онлайн+";
        myOnline2.unlimMessengers = true;
        myOnline2.unlimInternetAbroad = true;
        myOnline2.volumeOfMinutes = 600;
        myOnline2.umnlimMinutesOnTele2 = true;
        myOnline2.tariffPaymentOnRubles = 350;
        myOnline2.payment = Payment.onMonth;
        myOnline2.trafficVolume = 20;
        myOnline2.traffic = Traffic.gigabyte;

        Tariff mySpeak = new Tariff();
        mySpeak.id = 3;
        mySpeak.name = "Мой Разговор";
        mySpeak.volumeOfMinutes = 250;
        mySpeak.umnlimMinutesOnTele2 = true;
        mySpeak.tariffPaymentOnRubles = 190;
        mySpeak.payment = Payment.onMonth;
        mySpeak.trafficVolume = 3;
        mySpeak.traffic = Traffic.gigabyte;

        Tariff myTele2 = new Tariff();
        myTele2.id = 4;
        myTele2.name = "Мой Tele2";
        myTele2.umnlimMinutesOnTele2 = true;
        myTele2.tariffPaymentOnRubles = 7;
        myTele2.payment = Payment.onDay;
        myTele2.trafficVolume = 6;
        myTele2.traffic = Traffic.gigabyte;

        Tariff unlim = new Tariff();
        unlim.id = 5;
        unlim.name = "Безлимитный";
        unlim.unlimTraffic = true;
        unlim.volumeOfMinutes = 500;
        unlim.umnlimMinutesOnTele2 = true;
        unlim.volumeOfSms = 50;
        unlim.tariffPaymentOnRubles = 400;
        unlim.payment = Payment.onMonth;

        Tariff premium = new Tariff();
        premium.id = 6;
        premium.name = "Премиум";
        premium.volumeOfMinutes = 2_000;
        premium.umnlimMinutesOnTele2 = true;
        premium.volumeOfSms = 500;
        premium.tariffPaymentOnRubles = 1_100;
        premium.payment = Payment.onMonth;
        premium.trafficVolume = 40;
        premium.traffic = Traffic.gigabyte;

        Tariff classic = new Tariff();
        classic.id = 7;
        classic.name = "Классический";
        classic.withoutSubscriptionFee = true;

        Tariff internenForDevices = new Tariff();
        internenForDevices.id = 8;
        internenForDevices.name = "Интернет для устройств";
        internenForDevices.withoutSubscriptionFee = true;

        Tariff internetForThings = new Tariff();
        internetForThings.id = 9;
        internetForThings.name = "Интернет для вещей";
        internetForThings.volumeOfMinutes = 30;
        internetForThings.volumeOfSms = 100;
        internenForDevices.tariffPaymentOnRubles = 100;
        internenForDevices.payment = Payment.onMonth;
        internenForDevices.trafficVolume = 300;
        internenForDevices.traffic = Traffic.megabyte;

    }
}
