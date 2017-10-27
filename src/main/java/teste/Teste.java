package teste;

import javax.persistence.EntityManager;

import com.lima.Financeiro.util.JpaUtil;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio");
		EntityManager manager = JpaUtil.getEntityManager();
		manager.close();
		System.out.println("Fim");
	}

}
