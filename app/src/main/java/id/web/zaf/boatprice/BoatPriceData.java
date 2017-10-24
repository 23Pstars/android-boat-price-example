package id.web.zaf.boatprice;

import java.util.ArrayList;

public class BoatPriceData {

    public static String[][] data = new String[][]{
            {
                    "2017-10-23 04:02:02",
                    "446325",
                    "Gili Trawangan",
                    "12:30:00",
                    "Nusa Lembongan",
                    "12:30:00",
                    "Gili Tickets",
                    "Eka Jaya",
                    "https://www.gilitickets.com",
                    "https://api.lrsoft.id/boat-price/assets/images/logos/ekajaya.png",
                    "https://api.lrsoft.id/boat-price/assets/images/boats/ekajaya.jpg"
            },
            {
                    "2017-10-23 04:01:56",
                    "473375",
                    "Gili Trawangan",
                    "11:30:00",
                    "Bali",
                    "11:30:00",
                    "Gili Tickets",
                    "Mahi Mahi Dewata",
                    "https://www.gilitickets.com",
                    "https://api.lrsoft.id/boat-price/assets/images/logos/mahimahi.png",
                    "https://api.lrsoft.id/boat-price/assets/images/boats/mahimahi.jpg"
            },
            {
                    "2017-10-23 04:01:56",
                    "459850",
                    "Gili Trawangan",
                    "10:30:00",
                    "Bali",
                    "10:30:00",
                    "Gili Tickets",
                    "Wahana Gili Ocean",
                    "https://www.gilitickets.com",
                    "https://api.lrsoft.id/boat-price/assets/images/logos/wahana.png",
                    "https://api.lrsoft.id/boat-price/assets/images/boats/wahana.jpeg"
            },
            {
                    "2017-10-23 04:01:55",
                    "446325",
                    "Gili Trawangan",
                    "10:15:00",
                    "Bali",
                    "10:15:00",
                    "Gili Tickets",
                    "Pancha Express",
                    "https://www.gilitickets.com",
                    "https://api.lrsoft.id/boat-price/assets/images/default.png",
                    "https://api.lrsoft.id/boat-price/assets/images/boats/pancha.jpg"
            },
            {
                    "2017-10-23 04:00:03",
                    "450000",
                    "Gili Air",
                    "14:00:00",
                    "Bali",
                    "16:45:00",
                    "Lombok Fast Boats",
                    "Marina Srikandi",
                    "https://www.lombokfastboats.com",
                    "https://api.lrsoft.id/boat-price/assets/images/logos/marina.png",
                    "https://api.lrsoft.id/boat-price/assets/images/boats/marina.jpg"
            },
            {
                    "2017-10-23 04:00:03",
                    "370000",
                    "Gili Trawangan",
                    "10:45:00",
                    "Bali",
                    "13:20:00",
                    "Lombok Fast Boats",
                    "Semaya One",
                    "https://www.lombokfastboats.com",
                    "https://api.lrsoft.id/boat-price/assets/images/logos/semaya.png",
                    "https://api.lrsoft.id/boat-price/assets/images/boats/semaya.jpeg"
            }
    };

    public static ArrayList<BoatPrice> getListData() {
        BoatPrice boatPrice;
        ArrayList<BoatPrice> list = new ArrayList<>();
        for (String[] aData : data) {
            boatPrice = new BoatPrice();
            boatPrice.setFetchDate(aData[0]);
            boatPrice.setPrice(aData[1]);
            boatPrice.setDepart(aData[2]);
            boatPrice.setDepartTime(aData[3]);
            boatPrice.setArrive(aData[4]);
            boatPrice.setArriveTime(aData[5]);
            boatPrice.setAgent(aData[6]);
            boatPrice.setBoat(aData[7]);
            boatPrice.setAgentSite(aData[8]);
            boatPrice.setBoatLogo(aData[9]);
            boatPrice.setBoatPhoto(aData[10]);
            list.add(boatPrice);
        }
        return list;
    }

}
