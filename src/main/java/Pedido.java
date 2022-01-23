public class Pedido {

    private String nome;
    private PedidoEstado estado;

    public Pedido(){
        this.estado = PedidoEstadoRealizado.getInstance();
    }
    public void setEstado(PedidoEstado estado){
        this.estado = estado;
    }

    public String aberto(){
        return estado.aberto(this);
    }

    public String pronto(){
        return estado.pronto(this);
    }

    public String despachado(){
        return estado.despachado(this);
    }

    public String aceito(){
        return estado.aceito(this);
    }

    public String caminho(){
        return estado.caminho(this);
    }

    public String entregue(){
        return estado.entregue(this);
    }

    public String realizado(){
        return estado.realizado(this);
    }

    public String cancelado(){
        return estado.cancelado(this);
    }

    public String getNomeEstado(){
        return  estado.getEstado();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public  PedidoEstado getEstado(){
        return estado;
    }
}
