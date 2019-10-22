package recycleview.picodiploma.dicoding.com.boba;

import java.util.ArrayList;

class BobaData {
    private static String[] bobaNames = {
            "Xing Fu Tang",
            "Tiger Sugar",
            "Diagon Alley",
            "One Zo",
            "Kokumi",
            "Ban Ban",
            "Hey Cha",
            "Kamu Tea",
            "Hei Hei",
            "KOI"
    };

    private static String[] bobaDetail = {
            "Xing Fu Tang akhirnya membuka gerainya di Indonesia juga, tepatnya di Jakarta. Sejak mulai beroperasi pada Juni 2019, tempat ini sangat disambut hangat oleh banyak orang. Karena namanya yang begitu terkenal dan banyak ",
            "kekinian. Menu yang menjadi andalan di tempat ini adalah Brown Sugar Boba Milk yang mampu membuat demam boba di Indonesia, khususnya Jakarta menjadi lebih ",
            "orang penasaran untuk mengantri demi segelas minuman dengan topping boba yang kenyal. Soal ukuran, boba di sini cukup kecil sehingga akan mudah untuk dikunyah. Harga Boba Brown Sugar yang ditawarkan bisa dibilang cukup ",
            "mu masih bertanya-tanya kenapa OneZo wajib kau cicipi yaitu karena rasa creemy dan manis yang sangat pas di mulut. Untuk ukuran, tersedia dua ukuran yang ",
            "erti Okinawa Brown Sugar Big Boba, Kokomi sangat worth it untuk dicicipi karena selain soal rasa, tempat ini juga memiliki antrian yang tidak terlalu parah dibandingkan me",
            "dan makanan yang sangat menarik, apalagi dengan Cheese Tea yang membuat penasaran. Miruku dengan topping boba adalah salah satu menu yang paling banyak dipesan di Ba",
            "mbinasi rasa susu, brown sugar, teh, serta topping boba menjadi suatu kenikmatan tiada tara. Jika kamu bosan dengan Brown Sugar, maka kamu bisa membeli varian lainnya seperti Es Kopi Susu yang tak kalah kekinian. Untuk harga, s",
            "dengan topping boba yang banyak digemari oleh warga Jakarta. Sedikit strong pada rasa Brown Sugar, creamy yang pas, dan tak lupa lembutnya boba akan teras",
            "gat pas. Brown sugar, susu, serta tak lupa topping boba membuat cita rasa begitu menyatu dan nikmat di mulut. Tekstur boba-nya pun sangat lembut dan uku",
            "begitu banyak digemari. Awalnya KOI ini menjadi populer karena varian milk tea yang beragam. Namun karena trend boba lagi sangat kekinian, kamu kini dapat menemukan"
    };

    private static int[] bobaPhoto ={
            R.drawable.ahmad_dahlan,
            R.drawable.ahmad_yani,
            R.drawable.bung_tomo,
            R.drawable.gatot_subroto,
            R.drawable.ki_hadjar_dewantara,
            R.drawable.mohammad_hatta,
            R.drawable.sudirman,
            R.drawable.sukarno,
            R.drawable.supomo,
            R.drawable.tan_malaka
    };

    private static String[] bobaPrice = {
            "20.000",
            "21.000",
            "22.000",
            "23.000",
            "24.000",
            "25.000",
            "26.000",
            "27.000",
            "28.000",
            "29.000"
    };

    static ArrayList<Boba> getListData() {
        ArrayList<Boba> list = new ArrayList<>();
        for(int position = 0; position < bobaNames.length; position++){
            Boba boba = new Boba();
            boba.setName(bobaNames[position]);
            boba.setDetail(bobaDetail[position]);
            boba.setPhoto(bobaPhoto[position]);
            boba.setPrice(bobaPrice[position]);
            list.add(boba);
        }
        return list;
    }
}
