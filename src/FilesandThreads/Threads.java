package FilesandThreads;

public class Threads {

    //Dar Estelah Nakh Bazi :)))))


    public Threads() throws InterruptedException {
        MainThread();
        DownloadThread();

    }

    public void MainThread() throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("Main thread is running");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //Ba in kar age hala play ro bznim hamash har 1 saniye mige ke main thread is running mesle yek nakh.
                }
            }
        }).start();


}
public void DownloadThread() throws InterruptedException {

        //hala mitonim baraye download tgread ham besazim:
    new Thread(new Runnable() {
        @Override
        public void run() {
            int counter = 0;
            while (true) {
                System.out.println("Download thread is running");
                counter ++;
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(counter>10)break;
                System.out.println("Download task finished");
                //Vaghti ke play ro miznim hamash main thread is running ro miyare va khabari az download thread is running nist.
                //Hala chejori in moshkelo hal konim?
                //1:mirim to public void mainthread ---> new Thread(new runnable).start():.daghighn zire while minevisim.
                //2:Hala mirim toye public void download thread ---> new Thread(new runnable)--->dar khati ke ham ghermez mishe va error mide --->.start(); ro type mikonim.
                //3:Hala az entehaye paranteze while hame text haro montaghel mikonim to public void run ziresh.
                //Finally:Age plaay ro bznim be sorate yek dar miyan ejra mishe.


                //Hala age on if va int o counter++ ro bznim mitonim begim ke bade ye modati in akr tamom beshe masalan bade 10 bar omadanesh ke to parantez if neveshtim.

            }


        }
    }).start();



    }
}


