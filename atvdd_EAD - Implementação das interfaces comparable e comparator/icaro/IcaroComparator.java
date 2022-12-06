package icaro;

import java.util.Comparator;

public class IcaroComparator implements Comparator<Livro>{ // fazer ordenar por nome
	public int compare(Livro primeiro, Livro segundo) {
		return primeiro.getNome().compareTo(segundo.getNome());
	}
}