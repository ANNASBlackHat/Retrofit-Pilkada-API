package com.developer.annasblackhat.retrofitpilkadaapi;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ANNAS BlackHat on 22/01/2016.
 */
public class Pilkada {

    private Data data;

    public Pilkada(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    class Data{
        Results results;

        public Results getResults() {
            return results;
        }

        public void setResults(Results results) {
            this.results = results;
        }
    }

    class Results{
        Candidates[] candidates;

        public Candidates[] getCandidates() {
            return candidates;
        }

        public void setCandidates(Candidates[] candidates) {
            this.candidates = candidates;
        }
    }

    class Candidates{
        int id;
        String dukungan;
        Paslon[] paslon;

        public Paslon[] getPaslon() {
            return paslon;
        }

        public void setPaslon(Paslon[] paslon) {
            this.paslon = paslon;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDukungan() {
            return dukungan;
        }

        public void setDukungan(String dukungan) {
            this.dukungan = dukungan;
        }
    }

    class Paslon{
        String nama;
        String pekerjaan;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getPekerjaan() {
            return pekerjaan;
        }

        public void setPekerjaan(String pekerjaan) {
            this.pekerjaan = pekerjaan;
        }
    }
}

// Data Dalam Bentuk JSON
// Agar lebih mudah dipahami, gunakan : http://jsoneditoronline.org

/*{"data":{"results":{"count":10,"total":827,"candidates":[{"id":"246","provinsi":{"id":17,"nama":"BENGKULU"},"daerah":{"id":21841,"nama":"BENGKULU"},"id_peserta":"246","no_urut":"1","paslon":[{"kind":"CALON","nama":"Dr. H. Ridwan Mukti, M.H","jk":"L","pob":"Lubuk Linggau","dob":"1963-05-21","alamat":"PKB, Hanura, PKPI, Nasdem","pekerjaan":"Wiraswasta","status":"1"},{"kind":"WAKIL","nama":"Dr. H. Rohidin Mersyah, M.M","jk":"L","pob":"Manna","dob":"1970-01-09","alamat":"PKB, Hanura, PKPI, Nasdem","pekerjaan":"Wakil Bupati Kabupaten Bengkulu Selatan","status":"1"}],"jenis_dukungan":"PARPOL","dukungan":"Partai NasDem, PKPI, Partai Hanura, PKB","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":"TIDAK LENGKAP","hasil_penelitian":"BELUM MEMENUHI SYARAT","penerimaan_dokumen_perbaikan":"LENGKAP","jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=246"},{"id":"624","provinsi":{"id":17,"nama":"BENGKULU"},"daerah":{"id":21841,"nama":"BENGKULU"},"id_peserta":"624","no_urut":"2","paslon":[{"kind":"CALON","nama":"Sultan B. Najamudin","jk":"L","pob":"Anggut","dob":"1979-05-11","alamat":"Jl. Mahakam 3 Nomor 10 RT 15 RW. 03 Kel. Jalan Gedang Kec. Gading Cempaka","pekerjaan":"Swasta","status":null},{"kind":"WAKIL","nama":"Mujiono","jk":"L","pob":"Semarang","dob":"1968-08-08","alamat":"Jl. Cimanuk Indah No. 09 RT. 05, RW. 02 Kota Bengkulu","pekerjaan":"Anggota DPRD Provinsi Bengkulu","status":null}],"jenis_dukungan":"PARPOL","dukungan":"PDIP, Partai Demokrat","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":"TIDAK LENGKAP","hasil_penelitian":"BELUM MEMENUHI SYARAT","penerimaan_dokumen_perbaikan":"LENGKAP","jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=624"},{"id":"494","provinsi":{"id":15,"nama":"JAMBI"},"daerah":{"id":16687,"nama":"JAMBI"},"id_peserta":"494","no_urut":"1","paslon":[{"kind":"CALON","nama":"H. Hasan Basri Agus","jk":"L","pob":"DESA SEI. ABANG KAB. SAROLANGUN","dob":"1953-12-31","alamat":"JL. SULTAN THAHA NO.01 RT.01 KELURAHAN KASANG, KECAMATAN JAMBI TIMUR, KOTA JAMBI","pekerjaan":"GUBERNUR JAMBI","status":null},{"kind":"WAKIL","nama":"Edi Purwanto, S.Hi., M.Si","jk":"L","pob":"SAROLANGUN","dob":"1980-07-04","alamat":"KOMPLEK VILLA GADING MAYANG BLOK F NO.10 RT.030 KELURAHAN MAYANG MANGURAI, KECAMATAN KOTA BARU - KOTA JAMBI","pekerjaan":"WIRASWASTA","status":null}],"jenis_dukungan":"PARPOL","dukungan":"Partai Demokrat, PDIP, PKS, Partai Gerindra","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":"TIDAK LENGKAP","hasil_penelitian":"BELUM MEMENUHI SYARAT","penerimaan_dokumen_perbaikan":"LENGKAP","jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=494"},{"id":"441","provinsi":{"id":15,"nama":"JAMBI"},"daerah":{"id":16687,"nama":"JAMBI"},"id_peserta":"441","no_urut":"2","paslon":[{"kind":"CALON","nama":"H. Zumi Zola Zulkifli, S.TP., MA","jk":"L","pob":"JAKARTA","dob":"1980-03-31","alamat":"VILA BUKIT IBUL RT\/RW 006\/003 MUARA SSABAK BARAT, TANJUNG JABUNG TIMUR","pekerjaan":"BUPATI TANJUNG JABUNG TIMUR","status":"1"},{"kind":"WAKIL","nama":"Dr. Drs. H. Fachrori Umar, M.Hum","jk":"L","pob":"BEBEKO","dob":"1952-11-23","alamat":"JL. LETJEND SUPRAPTO NO.68 JAMBI","pekerjaan":"WAKIL GUBERNUR JAMBI","status":"5"}],"jenis_dukungan":"PARPOL","dukungan":"Partai NasDem, PKB, PAN, Partai Hanura","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":"TIDAK LENGKAP","hasil_penelitian":"BELUM MEMENUHI SYARAT","penerimaan_dokumen_perbaikan":"LENGKAP","jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=441"},{"id":"511","provinsi":{"id":14,"nama":"RIAU"},"daerah":{"id":15580,"nama":"KAB. PELALAWAN"},"id_peserta":"511","no_urut":"1","paslon":[{"kind":"CALON","nama":"H. M. Harris","jk":"L","pob":"LANGGAM","dob":"1950-02-02","alamat":"PANGKALAN KERINCI","pekerjaan":"BUPATI","status":null},{"kind":"WAKIL","nama":"Drs. H. Zardewan, MM","jk":"L","pob":"PELALAWAN","dob":"1956-09-07","alamat":"PANGKALAN KERINCI","pekerjaan":"PENSIUNAN PNS","status":null}],"jenis_dukungan":"PARPOL","dukungan":"PAN, Partai Gerindra, PKB, PKS, Partai NasDem, PBB","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":null,"hasil_penelitian":null,"penerimaan_dokumen_perbaikan":null,"jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=511"},{"id":"509","provinsi":{"id":14,"nama":"RIAU"},"daerah":{"id":15580,"nama":"KAB. PELALAWAN"},"id_peserta":"509","no_urut":"2","paslon":[{"kind":"CALON","nama":"Zukri","jk":"L","pob":"KUALA TERUSAN","dob":"1979-04-03","alamat":"PANGKALAN KERINCI","pekerjaan":"ANGGOTA DPRD","status":null},{"kind":"WAKIL","nama":"Drs. H. Abdul Anas Badrun","jk":"L","pob":"TANJUNG SUM","dob":"1964-06-09","alamat":"PANGKALAN KERINCI","pekerjaan":"WIRASWASTA","status":null}],"jenis_dukungan":"PARPOL","dukungan":"PDIP, Partai Demokrat, Partai Hanura","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":null,"hasil_penelitian":null,"penerimaan_dokumen_perbaikan":null,"jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=509"},{"id":"775","provinsi":{"id":14,"nama":"RIAU"},"daerah":{"id":15873,"nama":"KAB. ROKAN HILIR"},"id_peserta":"775","no_urut":"1","paslon":[{"kind":"CALON","nama":"Drs. H. Wan Syamsir Yus","jk":"L","pob":"KISARAN","dob":"1953-03-05","alamat":"JL. HANG TUAH UJUNG\/ SPBU RT.003.RW. KELURAHAN REJOSARI KECAMATAN TENAYAN RAYA PEKANBARU PROVINSI RIAU","pekerjaan":"PENSIUNAN PNS","status":null},{"kind":"WAKIL","nama":"H. Helmi Jazid, SE","jk":"L","pob":"SEKELADI","dob":"1962-08-14","alamat":"JL.PRAMUKA NO.07 BANGKINANG","pekerjaan":"WIRASWASTA","status":null}],"jenis_dukungan":"PARPOL","dukungan":"Partai Golkar","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":"TIDAK LENGKAP","hasil_penelitian":"BELUM MEMENUHI SYARAT","penerimaan_dokumen_perbaikan":"LENGKAP","jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=775"},{"id":"537","provinsi":{"id":14,"nama":"RIAU"},"daerah":{"id":15873,"nama":"KAB. ROKAN HILIR"},"id_peserta":"537","no_urut":"2","paslon":[{"kind":"CALON","nama":"H. Suyatno","jk":"L","pob":"BENGKALIS","dob":"1957-06-21","alamat":"BAGANSIAPIAPI","pekerjaan":"BUPATI","status":null},{"kind":"WAKIL","nama":"Drs. Jamiludin","jk":"L","pob":"TELUK BANO I","dob":"1968-02-05","alamat":"DUSUN SEI RUMBIA RT.010 \/RW.004 KEPENGHULUAN BANGKO PERMATA KECAMATAN BANGKO PUSAKO","pekerjaan":"ANGGOTA DPRD","status":"2"}],"jenis_dukungan":"PARPOL","dukungan":"PDIP, Partai Hanura, Partai NasDem, PKPI","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":null,"hasil_penelitian":null,"penerimaan_dokumen_perbaikan":null,"jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=537"},{"id":"749","provinsi":{"id":14,"nama":"RIAU"},"daerah":{"id":15873,"nama":"KAB. ROKAN HILIR"},"id_peserta":"749","no_urut":"3","paslon":[{"kind":"CALON","nama":"H. Syafrudin","jk":"L","pob":"BAGAN PUNAK","dob":"1960-11-12","alamat":"JL.KECAMATAN RT.011\/RW.005 BAGANSIAPIAPI","pekerjaan":"PNS","status":"5"},{"kind":"WAKIL","nama":"Mohamad Ridwan, S.IP","jk":"L","pob":"DUMAI","dob":"1973-03-25","alamat":"JL.MADRASAH RT.014.RW. 004 KELURAHAN BAGAN TIMUR KECAMATAN BANGKO","pekerjaan":"ANGGOTA DPRD","status":"2"}],"jenis_dukungan":"PARPOL","dukungan":"Partai Gerindra, Partai Demokrat","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":null,"hasil_penelitian":null,"penerimaan_dokumen_perbaikan":null,"jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=749"},{"id":"758","provinsi":{"id":14,"nama":"RIAU"},"daerah":{"id":15873,"nama":"KAB. ROKAN HILIR"},"id_peserta":"758","no_urut":"4","paslon":[{"kind":"CALON","nama":"H. Herman Sani, SH, M.Si","jk":"L","pob":"BAGANSIPAIPAI","dob":"1958-08-16","alamat":"JL.PARIT INDAH, PERUMAHAN PERMATA RATU BLOK Q NO. 30","pekerjaan":"PNS","status":"5"},{"kind":"WAKIL","nama":"Taem","jk":"L","pob":"BINJAI","dob":"1964-12-30","alamat":"JL. JATI III NO.124 MEDAN","pekerjaan":"PENSIUNAN","status":null}],"jenis_dukungan":"PARPOL","dukungan":"PKB, PAN, PKS","pilihan_suara":"KURSI","status_penerimaan":"DITERIMA","kelengkapan_dokumen":null,"hasil_penelitian":null,"penerimaan_dokumen_perbaikan":null,"jumlah_dukungan_awal":null,"jumlah_dukungan_perbaikan":null,"jumlah_dukungan_penetapan":null,"pemenuhan_syarat_dukungan":null,"pemenuhan_syarat_dukungan_perbaikan":null,"pertahana":null,"dinasti":null,"perempuan":null,"incumbent":null,"sumber":"http:\/\/infopilkada.kpu.go.id\/index.php?r=dashboard\/paslondetil\u0026id=758"}]}}}*/

