

public class Turista implements Runnable{
    private String nome;

    public Turista(String nome){
        this.nome=nome;
    }
    public String getTurista(){
        return this.nome;
    }
    public void setTurista(String nome){
        this.nome=nome;
    }
    @Override
    public synchronized void run() {
      
       int numero=(int)(Math.random()*9)+1;
            System.out.println("il turista "+nome+" sta visitando");
            System.out.println("il turista "+nome+" ha visitato il museo per:" +numero+" secondi");
                try {
                    wait(1000);
                } catch (Exception e) {
                   
                }
            
        
    }

}
