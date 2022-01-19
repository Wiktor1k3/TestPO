package Kandydat;

public class Kandydat implements Cloneable, Comparable<Kandydat> {

    private String nazwa;
    private Integer wiek;
    private String wykształcony;
    private Integer latadoświadczenia;

    public Kandydat(String nazwa, Integer wiek, String wykształcony, Integer latadoświadczenia){
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wykształcony = wykształcony;
        this.latadoświadczenia = latadoświadczenia;

    }

    public String getNazwa(){return nazwa;}
    public Integer getWiek(){return wiek;}
    public String getWykształcony(){return wykształcony;}
    public Integer getLatadoświadczenia(){return latadoświadczenia;}


    @Override
    public String toString() {
        String k = this.getNazwa() +" "+ this.getWiek() +" " + this.getWykształcony() + " " + this.getLatadoświadczenia();
        return k;
    }

    @Override
    public int compareTo(Kandydat o) {
        int CompareValue = 0;

        if(this.wykształcony.compareTo(o.wykształcony)== 0){
            if(this.wiek.compareTo(o.wiek)==0){
                CompareValue = 0;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue = 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=10;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=10;
                }
            }
            if(this.wiek.compareTo(o.wiek)>0){
                CompareValue +=100;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue += 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=10;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=10;
                }
            }
            if(this.wiek.compareTo(o.wiek)<0){
                CompareValue -=100;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue = 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=10;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=10;
                }
            }
        }
        if(this.wykształcony.compareTo(o.wykształcony)> 0){
            CompareValue +=100;
            if(this.wiek.compareTo(o.wiek)==0){
                CompareValue += 0;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue = 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=10;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=10;
                }
            }
            if(this.wiek.compareTo(o.wiek)>0){
                CompareValue +=10;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue = 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=1;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=1;
                }
            }
            if(this.wiek.compareTo(o.wiek)< 0){
                CompareValue -=10;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue = 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=1;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=1;
                }
            }
        }
        if(this.wykształcony.compareTo(o.wykształcony)< 0){
            CompareValue -=100;
            if(this.wiek.compareTo(o.wiek)==0){
                CompareValue += 0;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue += 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=1;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=1;
                }
            }
            if(this.wiek.compareTo(o.wiek)>0){
                CompareValue +=10;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue += 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=1;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=1;
                }
            }
            if(this.wiek.compareTo(o.wiek)<0){
                CompareValue -=10;
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)==0){
                    CompareValue += 0;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)> 0){
                    CompareValue +=1;
                }
                if(this.latadoświadczenia.compareTo(o.latadoświadczenia)< 0){
                    CompareValue -=1;
                }
            }
        }
        return CompareValue;
    }

    public static boolean Qualified(Kandydat k){
        int a = Rekrutacja.doswiadczenie;
        if(k.getLatadoświadczenia()>=a){
            return true;
        }
        return false;
    }
}
