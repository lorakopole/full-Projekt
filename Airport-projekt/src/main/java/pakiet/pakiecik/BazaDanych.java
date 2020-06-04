package pakiecik;

import java.util.Random;

public class BazaDanych {

	 static private String baza_ID_bagaz[] = {"Gucci","Armani","Samsonite","Tuni","Rimona","New Look","Solier","Wiking"};
	 static private String baza_Imion[] = {"Emma","Olivia","Ava","Isabella","Sophia","Charlotte","Mia","Amelia","Harper","Evelyn","Abigail","Emily","Elizabeth","Mila","Ella","Avery","Sofia","Camila","Aria","Scarlett","Victoria","Madison","Luna","Grace","Chloe","Penelope","Layla","Riley","Zoey","Nora","Lily","Eleanor","Hannah","Lillian","Addison","Aubrey","Ellie","Stella","Natalie","Zoe","Leah","Hazel","Violet","Aurora","Savannah","Audrey","Brooklyn","Bella","Claire","Skylar","Lucy","Paisley","Everly","Anna","Caroline","Nova","Genesis","Emilia","Kennedy","Samantha","Maya","Willow","Kinsley","Naomi","Aaliyah","Elena","Sarah","Ariana","Allison","Gabriella","Alice","Madelyn","Cora","Ruby","Eva","Serenity","Autumn","Adeline","Hailey","Gianna","Valentina","Isla","Eliana","Quinn","Nevaeh","Ivy","Sadie","Piper","Lydia","Alexa","Josephine","Emery","Julia","Delilah","Arianna","Vivian","Kaylee","Sophie","Brielle","Madeline","Peyton","Rylee","Clara","Hadley","Melanie","Mackenzie","Reagan","Adalynn","Liliana","Aubree","Jade","Katherine","Isabelle","Natalia","Raelynn","Maria","Athena","Ximena","Arya","Leilani","Taylor","Faith","Rose","Kylie","Alexandra","Mary","Margaret","Lyla","Ashley","Amaya","Eliza","Brianna","Bailey","Andrea","Khloe","Jasmine","Melody","Iris","Isabel","Norah","Annabelle","Valeria","Emerson","Adalyn","Ryleigh","Eden","Emersyn","Anastasia","Kayla","Alyssa","Juliana","Charlie","Esther","Ariel","Cecilia","Valerie","Alina","Molly","Reese","Aliyah","Lilly","Parker","Finley","Morgan","Sydney","Jordyn","Eloise","Trinity","Daisy","Kimberly","Lauren","Genevieve","Sara","Arabella","Harmony","Elise","Remi","Teagan","Alexis","London","Sloane","Laila","Lucia","Diana","Juliette","Sienna","Elliana","Londyn","Ayla","Callie","Gracie","Josie","Amara","Jocelyn","Daniela","Everleigh","Mya","Rachel","Summer","Alana","Brooke"};
	 static private String baza_nazwisk[] = {"Alaina","Mckenzie","Catherine","Amy","Presley","Journee","Rosalie","Ember","Brynlee","Rowan","Joanna","Paige","Rebecca","Ana","Sawyer","Mariah","Nicole","Brooklynn","Payton","Marley","Fiona","Georgia","Lila","Harley","Adelyn","Alivia","Noelle","Gemma","Vanessa","Journey","Makayla","Angelina","Adaline","Catalina","Alayna","Julianna","Leila","Lola","Adriana","June","Juliet","Jayla","River","Tessa","Lia","Dakota","Delaney","Selena","Blakely","Ada","Camille","Zara","Malia","Hope","Samara","Vera","Mckenna","Briella","Izabella","Hayden","Raegan","Michelle","Angela","Ruth","Freya","Kamila","Vivienne","Aspen","Olive","Kendall","Elaina","Thea","Kali","Destiny","Amiyah","Evangeline","Cali","Blake","Elsie","Juniper","Alexandria","Myla","Ariella","Kate","Mariana","Lilah","Charlee","Daleyza","Nyla","Jane","Maggie","Zuri","Aniyah","Lucille","Leia","Melissa","Adelaide","Amina","Giselle","Lena","Camilla","Miriam","Millie","Brynn","Gabrielle","Sage","Annie","Logan","Lilliana","Haven","Jessica","Kaia","Magnolia","Amira","Adelynn","Makenzie","Stephanie","Nina","Phoebe","Arielle","Evie","Lyric","Alessandra","Gabriela","Paislee","Raelyn","Madilyn","Paris","Makenna","Kinley","Gracelyn","Talia","Maeve","Rylie","Kiara","Evelynn","Brinley","Jacqueline","Laura","Gracelynn","Lexi","Ariah","Fatima","Jennifer","Kehlani","Alani","Ariyah","Luciana","Allie","Heidi","Maci","Phoenix","Felicity","Joy","Kenzie","Veronica","Margot","Addilyn","Lana","Cassidy","Remington","Saylor","Ryan","Keira","Harlow","Miranda","Angel","Amanda","Daniella","Royalty","Gwendolyn","Ophelia","Heaven","Jordan","Madeleine","Esmeralda","Kira","Miracle","Elle","Amari","Danielle","Daphne","Willa","Haley","Gia","Kaitlyn","Oakley","Kailani","Winter","Alicia","Serena","Nadia","Aviana","Demi","Jada","Braelynn","Dylan","Ainsley","Alison","Camryn","Avianna",};
	 static private String baza_ID_pasazer[] = {"13101301501","74102302502","31103303503","10104304504","86105305505","50106306506","55107307507","43108308508","36109309509","93110310510","68111311511","53112312512","13113313513","36114314514","94115315515","51116316516","92117317517","50118318518","94119319519","16120320520","55121321521","11122322522","10123323523","17124324524","79125325525","48126326526","18127327527","39128328528","35129329529","23130330530","86131331531","39132332532","18133333533","17134334534","75135335535","50136336536","35137337537","51138338538","61139339539","53140340540","91141341541","26142342542","92143343543","73144344544","65145345545","26146346546","36147347547","89148348548","15149349549","93150350550","95151351551","91152352552","12153353553","85154354554","85155355555","48156356556","34157357557","33158358558","30159359559","38160360560","35161361561","97162362562","65163363563","39164364564","27165365565","90166366566","24167367567","13168368568","29169369569","27170370570","88171371571","18172372572","50173373573","84174374574","14175375575","91176376576","46177377577","14178378578","66179379579","84180380580","71181381581","43182382582","65183383583","36184384584","84185385585","49186386586","82187387587","46188388588","27189389589","16190390590","60191391591","23192392592","73193393593","94194394594","92195395595","10196396596","16197397597","45198398598","21199399599","89200400600","23201401601","97202402602","81203403603","57204404604","72205405605","70206406606","20207407607","39208408608","27209409609","95210410610","20211411611","22212412612","88213413613","11214414614","50215415615","19216416616","44217417617","26218418618","86219419619","49220420620","67221421621","65222422622","33223423623","78224424624","44225425625","13226426626","71227427627","98228428628","73229429629","92230430630","92231431631","97232432632","62233433633","37234434634","62235435635","56236436636","95237437637","34238438638","41239439639","29240440640","95241441641","73242442642","22243443643","82244444644","47245445645","30246446646","34247447647","22248448648","95249449649","85250450650","46251451651","57252452652","10253453653","63254454654","92255455655","45256456656","16257457657","14258458658","90259459659","70260460660","88261461661","81262462662","69263463663","58264464664","76265465665","31266466666","12267467667","68268468668","74269469669","61270470670","72271471671","15272472672","42273473673","93274474674","57275475675","56276476676","74277477677","24278478678","58279479679","37280480680","74281481681","80282482682","51283483683","85284484684","36285485685","59286486686","99287487687","74288488688","10289489689","92290490690","32291491691","13292492692","93293493693","87294494694","73295495695","19296496696","32297497697","87298498698","24299499699","46300500700","60301501701","63302502702","34303503703","23304504704","95305505705","51306506706","28307507707","53308508708","75309509709","14310510710","70311511711","97312512712","68313513713","90314514714","96315515715","71316516716",};

	 static String get_ID_bagazu()
	{
		Random r = new Random();
		int liczba = r.nextInt(20)+1;
		return baza_ID_bagaz[liczba];
	}

	public static String[] getBaza_Imion() {
		Random r = new Random();
		int liczba = r.nextInt(baza_Imion.length)+1;
		return baza_Imion;
	}

	public static String[] getBaza_nazwisk() {
		Random r = new Random();
		int liczba = r.nextInt(baza_nazwisk.length)+1;
		return baza_nazwisk;
	}

	public static String[] getBaza_ID_pasazer() {
		Random r = new Random();
		int liczba = r.nextInt(baza_ID_pasazer.length)+1;
		return baza_ID_pasazer;
	}

	static int get_waga(){
		Random r = new Random();
		int liczba = r.nextInt(40)+1;
		return liczba;
	}

	static boolean Waznosc_Paszportu()
	{
		Random r = new Random();
		boolean waznosc = r.nextBoolean();
		return waznosc;
	}

}
