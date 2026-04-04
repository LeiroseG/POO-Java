package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class teste {
	public static void main(String[] args) {
	//	LocalDate d01 = LocalDate.now();
	//	LocalDateTime d02 = LocalDateTime.now();
	//	Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-04-20");
		LocalDateTime d05 = LocalDateTime.parse("2025-07-20T04:33:23");
		Instant d06 = Instant.parse("2025-07-20T04:33:23Z");
	//	Instant d07 = Instant.parse("2025-07-20T04:33:23-03:00");
		// https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate d08 = LocalDate.parse("20/07/2002", fmt1);
		// LocalDateTime d55 = LocalDateTime.parse ("20/02/2054 01:30",fmt1); forcando o
		// erro para teste
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // cuidado com os espaços ele tambem
																					// conta como formato
	//	LocalDateTime d09 = LocalDateTime.parse("20/02/2054 01:30", fmt2);// agora funciona depois do formatter
	//	LocalDate d10 = LocalDate.of(2011, 01, 05);
	//	LocalDateTime d11 = LocalDateTime.of(2022, 10, 21, 04, 33);
		/*
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		*/ 
		
		
		//Convertendo data-hora para texto
		//withZone(ZoneId.systemDefault() pega o fuso horario do computador da pessoa
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + fmt3.format(d06)); // aqui com fusohorario , quando for instant tem que formatar assim
		System.out.println("d05 = " + d06); //aqui data global
		
		
		// Convertendo data-hora global para local
		
		/* 
		 * for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		*/
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r1 = "+ r1);
		System.out.println("r2 = "+ r2);
		System.out.println("r3 = "+ r3);
		System.out.println("r4 = "+ r4);
		
		//chamando o dia mes ano
		
		System.out.println("d04 dia do mes = "+ d04.getDayOfMonth());
		System.out.println("d04 mes = "+ d04.getMonthValue());
		System.out.println("d04 ano = "+ d04.getYear());
		System.out.println("d04 dia do  ano = "+ d04.getDayOfYear());
		System.out.println("d04 mes escrito = "+ d04.getMonth());
		
		
		//Cálculos com data-hora
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("d04 atrasado = "+ pastWeekLocalDate );
		System.out.println("d04 adiantado = "+ nextWeekLocalDate );
		
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("d04 atrasado com datetime = "+ pastWeekLocalDateTime );
		System.out.println("d04 adiantado com datetime = "+ nextWeekLocalDateTime );
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("d04 atrasado instant = "+ pastWeekInstant );
		System.out.println("d04 adiantado instant = "+ nextWeekInstant );
		
		
		//Duraçao
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0) , d04.atTime(0,0));
		
		System.out.println("t1 dias = "+  t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDateTime , d05);
		
		System.out.println("t2 dias = "+  t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant , d06);
		
		System.out.println("t3 dias = "+  t3.toDays());
		
		
		
		
		
		
		
		
		
		
	}
	
}
