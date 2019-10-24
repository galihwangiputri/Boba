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

    private static String[] bobaInstagram = {
      "@reysgallery",
      "@stevanwang27",
      "@jktfoodead",
      "@janjimakan",
      "@ffoodin",
      "@indoeatstagram",
      "@heychaofficial",
      "@bellyculinary",
      "@heihei_id",
      "@foodaffair"
    };

    private static String[] bobaDetail = {
            "Xing Fu Tang akhirnya membuka gerainya di Indonesia juga, tepatnya di Jakarta. Sejak mulai beroperasi pada Juni 2019, tempat ini sangat disambut hangat oleh banyak orang. Karena namanya yang begitu terkenal dan banyak ditunggu, kita dapat lihat bahwa antrean di gerai Xing Fu Tang selalu ramai, bahkan antriannya panjang menjalar. Walaupun harus rela antre cukup lama, tapi perjuanganmu akan terbayar lunas dengan segelas minuman bertopping boba yang sangat nikmat",
            "Merek minuman asli dari Taiwan ini memang kepopulerannya tak perlu diragukan lagi. Bahkan orang rela antri berjam-jam mengantri demi segelas minuman dengan boba yang kekinian. Menu yang menjadi andalan di tempat ini adalah Brown Sugar Boba Milk yang mampu membuat demam boba di Indonesia, khususnya Jakarta menjadi lebih hype.",
            "Walaupun nama dan logonya sekilas mirip dengan merek tertentu, tapi Diagon Alley juga sangat populer di Jakarta. Rasa dan kemasannya yang kekinian, membuat orang penasaran untuk mengantri demi segelas minuman dengan topping boba yang kenyal. Soal ukuran, boba di sini cukup kecil sehingga akan mudah untuk dikunyah. Harga Boba Brown Sugar yang ditawarkan bisa dibilang cukup sedikit lumayan mahal, tapi worth it untuk kamu cicipi!",
            "Tersebar di berbagai negara, salah satunya Indonesia, menjadi salah satu bukti bahwa OneZo ini sangat pas untuk pelepas dahagamu. Tak hanya itu, minuman satu ini juga sangat dikenal dengan tekstur boba yang sangat lembut. Jika kamu masih bertanya-tanya kenapa OneZo wajib kau cicipi yaitu karena rasa creemy dan manis yang sangat pas di mulut. Untuk ukuran, tersedia dua ukuran yang mana bisa kamu pilih sesuai keinginan. ",
            "Rasa creamy yang sangat mantap, menjadi keunggulan dari minuman di Kokomi. Warna-warni pelangi diangkat menjadi tema merek satu ini. Dengan menu andalannya seperti Okinawa Brown Sugar Big Boba, Kokomi sangat worth it untuk dicicipi karena selain soal rasa, tempat ini juga memiliki antrian yang tidak terlalu parah dibandingkan merek lain.",
            "Nama Ban Ban semakin ramai dibicarakan ketika banyaknya influencer yang me-review minuman ini di Instagram mereka. Beragam varian menu baik minuman dan makanan yang sangat menarik, apalagi dengan Cheese Tea yang membuat penasaran. Miruku dengan topping boba adalah salah satu menu yang paling banyak dipesan di Ban Ban. Segelas minuman di sini akan semakin lengkap dengan makanan roti panggang yang memiliki topping juga.",
            "Seperti Diagon Alley, nama Heycha juga sekilas mirip dengan merek boba lain. Kombinasi rasa susu, brown sugar, teh, serta topping boba menjadi suatu kenikmatan tiada tara. Jika kamu bosan dengan Brown Sugar, maka kamu bisa membeli varian lainnya seperti Es Kopi Susu yang tak kalah kekinian. Untuk harga, satu gelas minuman di sini dijual cukup terjangkau, jadi nggak ada alasan kamu untuk tidak membelinya.",
            "Logo orang dengan ukuran kepala besar begitu familiar bagi penikmat boba. Minuman bernama Kamu Tea ini belum lama membuat menu baru yaitu Brown Sugar dengan topping boba yang banyak digemari oleh warga Jakarta. Sedikit strong pada rasa Brown Sugar, creamy yang pas, dan tak lupa lembutnya boba akan terasa lengkap ketika pertama kali kamu meminumnya.",
            "Berlokasi di Mal Taman Anggrek, Jakarta Barat, Heihei menyajikan komposisi minuman yang sangat pas. Brown sugar, susu, serta tak lupa topping boba membuat cita rasa begitu menyatu dan nikmat di mulut. Tekstur boba-nya pun sangat lembut dan ukurannya begitu pas, tidak terlalu besar hingga mudah kamu untuk kunyah.",
            "Merek satu ini mungkin sudah tidak asing lagi di telinga karena sudah berdiri cukup lama. Tempatnya yang nyaman, beragam pilihan menu, serta harganya yang bisa dibilang lebih terjangkau dengan merek lainnya, membuat KOI begitu banyak digemari. Awalnya KOI ini menjadi populer karena varian milk tea yang beragam. Namun karena trend boba lagi sangat kekinian, kamu kini dapat menemukan brown sugar dengan topping boba di sini."
    };

    private static int[] bobaPhoto ={
            R.drawable.xin_fu_tang,
            R.drawable.tiger_sugar,
            R.drawable.diagon_alley,
            R.drawable.one_zo,
            R.drawable.kokumi,
            R.drawable.ban_ban,
            R.drawable.hey_cha,
            R.drawable.kamu_tea,
            R.drawable.hei_hei,
            R.drawable.koi
    };

    private static String[] bobaPrice = {
            "20.000",
            "22.000",
            "14.000",
            "20.000",
            "25.000",
            "22.000",
            "15.000",
            "17.000",
            "25.000",
            "14.000"
    };

    private static String[] bobaRating = {
            "4.3",
            "4.4",
            "4.2",
            "4.8",
            "4.1",
            "4.5",
            "4.2",
            "4.1",
            "4.5",
            "4/3"
    };

    static ArrayList<Boba> getListData() {
        ArrayList<Boba> list = new ArrayList<>();
        for(int position = 0; position < bobaNames.length; position++){
            Boba boba = new Boba();
            boba.setName(bobaNames[position]);
            boba.setDetail(bobaDetail[position]);
            boba.setPhoto(bobaPhoto[position]);
            boba.setPrice(bobaPrice[position]);
            boba.setInstagram(bobaInstagram[position]);
            boba.setRating(bobaRating[position]);
            list.add(boba);
        }
        return list;
    }
}
