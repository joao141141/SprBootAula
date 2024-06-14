package dio2.aula2;

public class ViaCepResponse {
    private String cep;
    private String rua;
    private String localidade;



    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getLocalidade(){
        return localidade;
    }

    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }


    @Override
    public String toString(){
        return "ViaCepResponse{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }   

}
