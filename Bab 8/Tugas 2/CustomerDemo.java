public class CustomerDemo {
    public static void main(String[] args) {
        CustomerData cs1 = new CustomerData(
            "Bella Endah Oktaviani",
            "Ds. Bara Tambar No. 344, Bima 36908, Papua Barat", 
            "27 Maret 1957", 
            "Sales", 
            4500000);
        CustomerData cs2 = new CustomerData(
            "Gatot Caraka Gunawan",
            "Psr. Thamrin No. 811, Administrasi Jakarta Timur 59393, DKI Jakarta",
            "13 Oktober 1958",
            "Human Resource",
            9500000);
        CustomerData cs3 = new CustomerData(
            "Devi Pertiwi S.Pd",
            "Dk. Jaksa No. 884, Bekasi 83858, Banten",
            "18 Juli 1995",
            "Guru",
            4000000);
        CustomerData cs4 = new CustomerData(
            "Ikin Wibisono",
            "Kpg. Wahid Hasyim No. 451, Tual 95926, Bengkulu",
            "25 November 1985",
            "Karyawan Swasta",
            3500000);
        CustomerData cs5 = new CustomerData(
            "Balijan Waluyo",
            "Ds. Imam Bonjol No. 625, Semarang 64950, DKI Jakarta",
            "13 Januari 1975");
        CustomerData cs6 = new CustomerData(
            "Halima Utami",
            "Ds. Laksamana No. 958, Padang 29721, Kalimantan Barat",
            "7 Mei 1987");
        CustomerData cs7 = new CustomerData(
            "Cemplunk Pangestu",
            "Kpg. Sukajadi No. 988, Pekanbaru 56952, Riau",
            "14 Juni 1981");
        CustomerData cs8 = new CustomerData(
            "Erik Adriansyah",
            "Jln. Kartini No. 307, Pagar Alam 77851, Aceh");
        CustomerData cs9 = new CustomerData(
            "Devi Nasyiah",
            "Psr. Gedebage Selatan No. 564, Metro 66200, Papua");
        CustomerData cs10 = new CustomerData(
            "Jindra Pradipta",
            "Dk. Kebangkitan Nasional No. 644, Bandung 87788, Maluku");

        cs1.info();
        cs2.info();
        cs3.info();        
        cs4.info();
        cs5.info();
        cs6.info();
        cs7.info();
        cs8.info();
        cs9.info();
        cs10.info();
    }
}
