

/**
 *
 * @author davidfernandes
 */
public class Principal {
    
public static void main(String[] args) {
		

ListaDeProdutos l = new ListaDeProdutos(3);
Produto p1 = new Produto(1,"Sabonte", "015", 1.25);
Produto p2 = new Produto(2, "Arroz", "016", 25.00);
		
l.adicionafinal(p1);
l.adicionafinal(p2);
		
System.out.println(l.toString());
		
		
		
		
Cliente c1 = new Cliente("Harold", "111", "Rua 1");
		
System.out.println(c1.toString());
		
		
		
NotaFiscal nf = new NotaFiscal(1, 1, "05/11/2020", c1, l);
		
System.out.println(nf.toString());
		
System.out.println("================================");

PilhaDeNF p = new PilhaDeNF(3);
p.empilha(nf);
		
System.out.println("===========================");
		
System.out.println(p1.toString());
		
	}
}
