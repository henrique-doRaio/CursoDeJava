package entitiesEnu;

import Enumerado.StatusPedido;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date moment;
    private StatusPedido status;

    public Pedido() {

    }

    public Pedido(Integer id , Date moment, StatusPedido status){
        this.id = id;
        this.status = status;
        this.moment = moment;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Date getMoment() {
        return moment;
    }

    public StatusPedido getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pedido " +
                "id = " + id +
                ", moment = " + moment +
                ", status = " + status ;
    }
}
