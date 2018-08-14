# CompetitiveProgramming - Pasangan Terbaik (GEMASTIK 10)

Deskripsi:
Pak Chanek memiliki tiga buah array bilangan bulat: A dan B yang masing-masing memiliki N elemen, dan C yang memiliki M elemen. Untuk kemudahan, anggap bahwa indeks elemen-elemen array dimulai dari 0.

Diberikan sepasang bilangan bulat i dan j, Pak Chanek mendefinisikan f(i,j) sebagai berikut:

                                          f(i,j)= A[i] × B[j] + C[(A[i] × B[j]) mod M]
                                          
Pak Chanek ingin mengetahui nilai dari:

                                                        min0≤i,j<Nf(i,j)
                                                        
atau dengan kata lain, nilai terkecil dari f(i,j) untuk semua kemungkinan pasangan indeks array A dan B.

Bantulah Pak Chanek menghitung nilai tersebut!


Format Masukan:
Baris pertama berisi sebuah bilangan bulat T yang menyatakan banyaknya kasus uji. Baris-baris berikutnya berisi T kasus uji, yang masing-masing diberikan dalam format berikut ini:

N M

A[0] A[1] .. A[N-1]

B[0] B[1] .. B[N-1]

C[0] C[1] .. C[M-1]

Format Keluaran:
Untuk setiap kasus uji, keluarkan sebuah baris berisi nilai dari min0≤i,j<Nf(i,j).



Contoh Masukan:
2

4 2

3 14 15 9

26 53 58 97

93 2

4 3

3 14 15 9

26 53 58 97

93 2 38


Contoh Keluaran:
161
171


Penjelasan:
Pada contoh pertama, pasangan (i,j) yang menyebabkan f(i,j) minimum adalah (i=0,j=1). Nilai dari f(0,1) adalah:

A[0]×B[1]+C[(A[0]×B[1])mod2]=3×53+C[(3×53)mod2]=159+2=161

Pada contoh kedua, pasangan (i,j) yang menyebabkan f(i,j) minimum adalah (i=0,j=0). Nilai dari f(0,0) adalah:

A[0]×B[0]+C[(A[0]×B[0])mod3]=3×26+C[(3×26)mod3]=78+93=171


Batasan:
1 ≤ T ≤ 5
1 ≤ N ≤ 100.000
0 ≤ A[i], B[i], C[i] ≤ 1.000.000


Batasan Khusus Versi Sulit:
1 ≤ M ≤ 100.000

