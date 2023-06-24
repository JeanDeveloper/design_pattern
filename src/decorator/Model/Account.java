package decorator.Model;

public class Account {

    private int id;
    private String client;


    public Account(){

    }

    public Account(int id, String client){
        this.id = id;
        this.client = client;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", client='" + client + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
