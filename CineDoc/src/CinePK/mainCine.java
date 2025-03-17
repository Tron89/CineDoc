package CinePK;

public class mainCine {
	public static void main(String[] args) {
		Cine cine = new Cine(3);
		cine.venderEntrada();
		cine.venderEntrada();
		cine.venderEntrada();
		cine.venderEntrada();
		System.out.println(cine.getButacasOcupadas());
		cine.devolverEntrada();
		cine.devolverEntrada();
		cine.devolverEntrada();
		cine.devolverEntrada();
		System.out.println(cine.getButacasOcupadas());
	}
}
 