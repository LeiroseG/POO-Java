package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	
	private List<OrderItem> items = new ArrayList<>();

	
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
        items.add(item);
    }
	
	public void removeItem(OrderItem item) {
        items.remove(item);
    }
	
	public double total() {
		double sum=0;
		for (OrderItem item : items) {
			sum += item.subtotal();
		}
		return sum;
	}
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public List<OrderItem> getItems() {
		return items; 
		}
	
	
	@Override
    public String toString() {
        // Formatador para o instante do pedido (com horas, minutos e segundos)
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // StringBuilder é como um "construtor de textos"
        StringBuilder sb = new StringBuilder();
        
        // Vamos adicionando as linhas (o \n serve para pular de linha)
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        
        // Como criamos o toString() no Client, basta mandar ele adicionar o objeto 'client'
        sb.append("Client: ").append(client).append("\n"); 
        
        sb.append("Order items:\n");
        
        // Aqui entra a mágica da composição: percorremos a lista de itens!
        for (OrderItem item : items) {
            // Cada item vai usar o toString() que criamos no Passo 1 e pular de linha
            sb.append(item).append("\n");
        }
        
        // Por fim, chamamos o método total() que você já tinha feito
        sb.append("Total price: $").append(String.format("%.2f", total()));
        
        // Transforma o StringBuilder montado em uma String comum e retorna
        return sb.toString();
    }
}
