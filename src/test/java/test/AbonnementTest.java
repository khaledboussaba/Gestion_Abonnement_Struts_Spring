package test;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.entities.Abonnement;
import com.dev.entities.AbonnementGSM;
import com.dev.entities.AbonnementInternet;
import com.dev.service.IAbonnementService;

public class AbonnementTest {
	private ClassPathXmlApplicationContext context;
	private IAbonnementService service;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		service = (IAbonnementService) context.getBean("service");
	}

	@Test
	public void test() {
		
		List<Abonnement> abonnements1 = service.listeAbonnements(true);
		service.addAbonnement(new AbonnementGSM(new Date(), 7000, true, 400));
		service.addAbonnement(new AbonnementInternet(new Date(), 500, true, 4));
		List<Abonnement> abonnements2 = service.listeAbonnements(true);
		
		assertTrue(abonnements1.size() + 2 == abonnements2.size());
	}

}
