package br.usp.libras.syntax;

/**
 * Syntatic tags matching Cogroo POSTags.
 * 
 * 2.3 Categoria gramatical (nós terminais) em
 * http://www.linguateca.pt/floresta/BibliaFlorestal/anexo1.html
 * @author leonardo
 *
 */
public class MorphTags {

	public static final String NOUN = "n";
	public static final String PROP = "prop";
	public static final String ADJ = "adj";
	public static final String N_ADJ = "n-adj";
	public static final String V_FIN = "v-fin";
	public static final String V_INF = "v-inf";
	public static final String V_PCP = "v-pcp";
	public static final String V_GER = "v-ger";
	public static final String ART = "art";
	public static final String PRON_PERS = "pron-pers";
	public static final String PRON_DET = "pron-det";
	public static final String PRON_INDP = "pron-indp";
	public static final String ADV = "adv";
	public static final String NUM = "num";
	public static final String PRP = "prp";
	public static final String INTJ = "intj";
	public static final String CONJ_S = "conj-s";
	public static final String CONJ_C = "conj-c";
	
	public static boolean isVerb(String tag) {
		if (tag.equals(V_FIN) || tag.equals(V_GER) || tag.equals(V_INF) || tag.equals(V_PCP))
			return true;
		else
			return false;
	}

	public static boolean isPron(String tag) {
		if (tag.equals(PRON_DET) || tag.equals(PRON_INDP) || tag.equals(PRON_PERS))
			return true;
		else
			return false;
	}
	
	public static boolean isConj(String tag) {
		if (tag.equals(CONJ_C) || tag.equals(CONJ_S))
			return true;
		else
			return false;
	}

}
