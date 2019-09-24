public class Main {

    public static void main(String[] args) {

        Tariff myOnline = new Tariff();
        myOnline.id = 1;
        myOnline.name = "Мой Онлайн";
        myOnline.costOnMonthInRubles = 290;
        myOnline.trafficVolumeInGb = 15;
        myOnline.unlimMessengers = true;
        myOnline.volumeOfMinutes = 400;
        myOnline.umnlimMinutesOnTele2 = true;

        Tariff myOnline2 = new Tariff();
        myOnline2.id = 2;
        myOnline2.name = "Мой Онлайн+";
        myOnline2.costOnMonthInRubles = 350;
        myOnline2.trafficVolumeInGb = 20;
        myOnline2.unlimMessengers = true;
        myOnline2.unlimInternetAbroad = true;
        myOnline2.volumeOfMinutes = 600;
        myOnline2.umnlimMinutesOnTele2 = true;

        Tariff mySpeak = new Tariff();
        mySpeak.id = 3;
        mySpeak.name = "Мой Разговор";
        mySpeak.costOnMonthInRubles = 190;
        mySpeak.trafficVolumeInGb = 3;
        mySpeak.volumeOfMinutes = 250;
        mySpeak.umnlimMinutesOnTele2 = true;

        Tariff myTele2 = new Tariff();
        myTele2.id = 4;
        myTele2.name = "Мой Tele2";
        myTele2.costOnDayInRubles = 7;
        myTele2.trafficVolumeInGb = 6;
        myTele2.umnlimMinutesOnTele2 = true;

        Tariff unlim = new Tariff();
        unlim.id = 5;
        unlim.name = "Безлимитный";
        unlim.costOnMonthInRubles = 400;
        unlim.unlimTraffic = true;
        unlim.volumeOfMinutes = 500;
        unlim.umnlimMinutesOnTele2 = true;
        unlim.volumeOfSms = 50;

        Tariff premium = new Tariff();
        premium.id = 6;
        premium.name = "Премиум";
        premium.costOnMonthInRubles = 1_100;
        premium.trafficVolumeInGb = 40;
        premium.volumeOfMinutes = 2_000;
        premium.umnlimMinutesOnTele2 = true;
        premium.volumeOfSms = 500;

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
        internetForThings.costOnMonthInRubles = 100;
        internetForThings.trafficVolumeInMb = 300;
        internetForThings.volumeOfMinutes = 30;
        internetForThings.volumeOfSms = 100;

    }
}
