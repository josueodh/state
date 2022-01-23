import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp(){
        pedido = new Pedido();
    }

    // Realizado

    @Test
    public void naoDeveRealizarOPedidoDePedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido não realizado", pedido.realizado());
    }

    @Test
    public void deveColocarAbertoNoPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido em preparação na cozinha", pedido.aberto());
    }

    @Test
    public void deveColocarProntoNoPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido pronto para sair", pedido.pronto());
    }

    @Test
    public void deveColocarDespachadoNoPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido despachado para o entregador", pedido.despachado());
    }

    @Test
    public void deveColocarAceitoNoPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido aceito pelo entregador", pedido.aceito());
    }

    @Test
    public void deveColocarACaminhoNoPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido coletado pelo entregador, a caminho do cliente", pedido.caminho());
    }

    @Test
    public void deveColocarEntregueNoPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido entregue ao cliente", pedido.entregue());
    }

    @Test
    public void deveColocarCanceladoNoPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals( "Pedido cancelado", pedido.cancelado());
    }


    // ABERTO
    @Test
    public void naoDeveRealizarOPedidoDePedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Pedido não realizado", pedido.realizado());
    }

    @Test
    public void naoDeveColocarAbertoNoPedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Abertura não realizada", pedido.aberto());
    }

    @Test
    public void deveColocarProntoNoPedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Pedido pronto para sair", pedido.pronto());
    }

    @Test
    public void deveColocarDespachadoNoPedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Pedido despachado para o entregador", pedido.despachado());
    }

    @Test
    public void deveColocarAceitoNoPedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Pedido aceito pelo entregador", pedido.aceito());
    }

    @Test
    public void deveColocarACaminhoNoPedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Pedido coletado pelo entregador, a caminho do cliente", pedido.caminho());
    }

    @Test
    public void deveColocarEntregueNoPedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Pedido entregue ao cliente", pedido.entregue());
    }

    @Test
    public void deveColocarCanceladoNoPedidoAberto(){
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        assertEquals( "Pedido cancelado", pedido.cancelado());
    }

    // Pronto

    @Test
    public void naoDeveRealizarOPedidoDePedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Pedido não realizado", pedido.realizado());
    }

    @Test
    public void naoDeveColocarAbertoNoPedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Abertura não realizada", pedido.aberto());
    }

    @Test
    public void naoDeveColocarProntoNoPedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Status pronto inválido", pedido.pronto());
    }

    @Test
    public void deveColocarDespachadoNoPedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Pedido despachado para o entregador", pedido.despachado());
    }

    @Test
    public void deveColocarAceitoNoPedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Pedido aceito pelo entregador", pedido.aceito());
    }

    @Test
    public void deveColocarACaminhoNoPedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Pedido coletado pelo entregador, a caminho do cliente", pedido.caminho());
    }

    @Test
    public void deveColocarEntregueNoPedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Pedido entregue ao cliente", pedido.entregue());
    }

    @Test
    public void deveColocarCanceladoNoPedidoPronto(){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals( "Pedido cancelado", pedido.cancelado());
    }

    //Despachado

    @Test
    public void naoDeveRealizarOPedidoDePedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Status realizado inválido", pedido.realizado());
    }

    @Test
    public void naoDeveColocarAbertoNoPedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Status aberto inválido", pedido.aberto());
    }

    @Test
    public void naoDeveColocarProntoNoPedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Status pronto inválido", pedido.pronto());
    }

    @Test
    public void naoDeveColocarDespachadoNoPedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Status despachado inválido", pedido.despachado());
    }

    @Test
    public void deveColocarAceitoNoPedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Pedido aceito pelo entregador", pedido.aceito());
    }

    @Test
    public void deveColocarACaminhoNoPedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Pedido coletado pelo entregador, a caminho do cliente", pedido.caminho());
    }

    @Test
    public void deveColocarEntregueNoPedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Pedido entregue ao cliente", pedido.entregue());
    }

    @Test
    public void deveColocarCanceladoNoPedidoDespachado(){
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertEquals( "Pedido cancelado", pedido.cancelado());
    }

    //Aceito

    @Test
    public void naoDeveRealizarOPedidoDePedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Status realizado inválido", pedido.realizado());
    }

    @Test
    public void naoDeveColocarAbertoNoPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Status aberto inválido", pedido.aberto());
    }

    @Test
    public void naoDeveColocarProntoNoPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Status pronto inválido", pedido.pronto());
    }

    @Test
    public void naoDeveColocarDespachadoNoPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Status despachado inválido", pedido.despachado());
    }

    @Test
    public void naoDeveColocarAceitoNoPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Status aceito inválido", pedido.aceito());
    }

    @Test
    public void deveColocarACaminhoNoPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Pedido coletado pelo entregador, a caminho do cliente", pedido.caminho());
    }

    @Test
    public void deveColocarEntregueNoPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Pedido entregue ao cliente", pedido.entregue());
    }

    @Test
    public void deveColocarCanceladoNoPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Pedido cancelado", pedido.cancelado());
    }

    // A caminho
    @Test
    public void naoDeveRealizarOPedidoDePedidoCaminho(){
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        assertEquals( "Status realizado inválido", pedido.realizado());
    }

    @Test
    public void naoDeveColocarAbertoNoPedidoCaminho(){
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        assertEquals( "Status aberto inválido", pedido.aberto());
    }

    @Test
    public void naoDeveColocarProntoNoPedidoCaminho(){
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        assertEquals( "Status pronto inválido", pedido.pronto());
    }

    @Test
    public void naoDeveColocarDespachadoNoPedidoCaminho(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertEquals( "Status despachado inválido", pedido.despachado());
    }

    @Test
    public void naoDeveColocarAceitoNoPedidoCaminho(){
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        assertEquals( "Status aceito inválido", pedido.aceito());
    }

    @Test
    public void naoDeveColocarACaminhoNoPedidoCaminho(){
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        assertEquals( "Status a caminho inválido", pedido.caminho());
    }

    @Test
    public void deveColocarEntregueNoPedidoCaminho(){
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        assertEquals( "Pedido entregue ao cliente", pedido.entregue());
    }

    @Test
    public void deveColocarCanceladoNoPedidoCaminho(){
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        assertEquals( "Pedido cancelado", pedido.cancelado());
    }

    // Entregue
    @Test
    public void naoDeveRealizarOPedidoDePedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status realizado inválido", pedido.realizado());
    }

    @Test
    public void naoDeveColocarAbertoNoPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status aberto inválido", pedido.aberto());
    }

    @Test
    public void naoDeveColocarProntoNoPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status pronto inválido", pedido.pronto());
    }

    @Test
    public void naoDeveColocarDespachadoNoPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status despachado inválido", pedido.despachado());
    }

    @Test
    public void naoDeveColocarAceitoNoPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status aceito inválido", pedido.aceito());
    }

    @Test
    public void naoDeveColocarACaminhoNoPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status a caminho inválido", pedido.caminho());
    }

    @Test
    public void naoDeveColocarEntregueNoPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status entregue inválido", pedido.entregue());
    }

    @Test
    public void naoDeveColocarCanceladoNoPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals( "Status cancelado inválido", pedido.cancelado());
    }

    // Cancelado
    @Test
    public void naoDeveRealizarOPedidoDePedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status realizado inválido", pedido.realizado());
    }

    @Test
    public void naoDeveColocarAbertoNoPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status aberto inválido", pedido.aberto());
    }

    @Test
    public void naoDeveColocarProntoNoPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status pronto inválido", pedido.pronto());
    }

    @Test
    public void naoDeveColocarDespachadoNoPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status despachado inválido", pedido.despachado());
    }

    @Test
    public void naoDeveColocarAceitoNoPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status aceito inválido", pedido.aceito());
    }

    @Test
    public void naoDeveColocarACaminhoNoPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status a caminho inválido", pedido.caminho());
    }

    @Test
    public void naoDeveColocarEntregueNoPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status entregue inválido", pedido.entregue());
    }

    @Test
    public void naoDeveColocarCanceladoNoPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals( "Status cancelado inválido", pedido.cancelado());
    }
}