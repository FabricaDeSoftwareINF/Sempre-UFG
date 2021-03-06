package br.ufg.inf.sempreufg.modelo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;
import br.ufg.inf.sempreufg.enums.ParametrosLogging;
import org.junit.Before;

public class LogLocalTest 
{
	LogLocal logLocal = new LogLocal();
	ParametroLog parametro = new ParametroLog();
	ArrayList<ParametroLog> lista = new ArrayList<ParametroLog>();
        
	@Before
	public void setUp() throws Exception
	{
        lista.add(new ParametroLog(ParametrosLogging.LOG_DESTINATION.name(),"c:/joao" ));
        lista.add(new ParametroLog(ParametrosLogging.LOG_DIRECTORY.name(), "c:/home"));
        lista.add(new ParametroLog(ParametrosLogging.LOG_FILENAME.name(), "meuBackup"));
        lista.add(new ParametroLog(ParametrosLogging.LOG_ROTATION_AGE.name(), "200"));
        lista.add(new ParametroLog(ParametrosLogging.LOG_ROTATION_SIZE.name(), "200") );
        
        logLocal.configurarParametros(lista);
	}
	
	@After
	public void tearDown() throws Exception
	{
		//lista.clear();
	}
	
	@Test
	public void testDestinoLog() 
	{
		assertEquals("c:/joao", logLocal.getDestinoLog().getValor() );
	}
	
	
	@Test
	public void testDiretorioLog()
	{
		assertEquals("c:/home", logLocal.getDiretorioLog().getValor());
	}
	
	@Test
	public void testNomeArquivo()
	{
		assertEquals("meuBackup", logLocal.getNomeArquivo().getValor());
	}
	
	@Test
	public void testTempoDeVidaLog()
	{
		assertEquals("200", logLocal.getTempoDeVidaLog().getValor() );
	}
	
	@Test 
	public void testTamanhoMaximoLog()
	{
		assertEquals( "200", logLocal.getTamanhoMaximoLog().getValor() );
	}

}
