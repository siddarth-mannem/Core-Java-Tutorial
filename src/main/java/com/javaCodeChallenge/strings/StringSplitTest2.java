package com.javaCodeChallenge.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Number of Good Ways to Split a String
 * 
 * You are given a string s, a split is called good if you can split s into 2 non-empty 
 * strings p and q where its concatenation is equal to s and the number of distinct letters 
 * in p and q are the same.Return the number of good splits you can make in s.
 * 
 * Ref: https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
 * 
 * @author siddharth
 * @Created Oct 22, 2020
 *
 */
public class StringSplitTest2 {

	public static void main(String[] args) {
		
		String s = "icahdfbifaefihedbhcibeiigihiggdfcccdbhgeaedggddfdfceachbcehiaidfihagbdbhhciabadifadeceabdchhacfhgecaecifcbhhihcbfddeddheahcaiacgciiicgaficehbicidgchdgiiciidccgheechihbbihhfacabhgfbdgcefehfedcegdbggcgbdihdffdehdhchgcgaabebfdaihhieffbbeedgidcbiachedebgbahgafbbeighggcgdfbbhhdebiefcffacacaibfagbibcegdccahfbbehiiieddibdaedibaecbcgfehffaeccgfdfgbgffgdefhbgbafbhcffbefabeagbcacecbdaicahfehaigegcadfdibheiahcfbehdidbiciegbfefcgdfhibgggdddfifacbaaahggadbibdgfegeebeddechghdgiedbfcfciddhggifaiddbcdgibidhhgiagebeifdcacbigigbicghachcedaaicaiafgbdediibdggaggafahihbhddbhecbffhhhibbhecdbgiefcaiibeagbgafedeechbbifddhgcdcfafgieecfehdaedegdihdbibhficgiaeheecaegcbhcighfdiecficcgfheifbghdgbhfcbfdciffiiggaffbgfddcicgagggfgfaecfdheiafhhabebadhcgccafibaagheaibdigbbfggfiicfighefhfbdehfaiiiacchcfegiiecaaibecebgiefeedgccfcbhchhgieddbeaffgeeeaeifbhicdcfgbeadfeaifcbeahgfcceabagbaediegeaieaiabgdahgbeiebadhchieggcfbffcadebehcdcahaceiaaiaaigacefecdgiadabfiggiabahfeagdgcefahchceggiebaddbifichcibhhbgbadbgcdaegheefffadadbhbifidfdedabaagddbcbifahgbfeehbgbibgabcigcbehbedabfcfiefacdhbahagfaceadegicgbadhffecicgfcffbbiefbegbhddhehggghfegabigiihdfbbehiaaeihdeafcigacefgfigdcdfdhehdgebabfidbhcibiicggcechdaadfccbgfcgdcgedhdebhbceieffegbbhibegegfcicfaggdiihhibeaegeghieiehbebefdhcdbeiibiecddafhaaeaagidiiageccaaaadcebefhbedbicegeeiacfaibaihchgfdiabgchcfagfbefaccedbdihhieehghdgaaiedbdecciiffcdffiafiiidbhccaihbdhefhabgieegficbdfcbcbfebgghhibedbegeegigaddegfhdhbiahhiffbbcdffbfbbdibhgfbbfaheihceadiacchgbhfehhigacgdededdehaiddadihfbiiahhdbaefhhibgibcdedfeggiebdchdbbcehihahcdeddghgiaeghaebigbggfcbcdcgbccbgidaebccffeegicibgdahgdfechiahciadafcfbhdfcebagfbiadaheifbagbbgggcifecegfefibbibdegfhchiaegagegchaecffhgciaadhgiidhhbdcedeeecabaefhebaccdcagcbigedhbhceegdiecdgagdbbegceiiibiaciafffiadccaeabhecaidfbcbccihbgafghfebfeahacgbbhddchhafehaccgdgcegdbabcbiabihbihcfebeaffcggfcbiiaacfegdagfefbaeggheheceeeaiagfbiffdhgagegfcibbghdbfaicaiihcegcdabdcfefhgbagfaffahgeghgccacehbbbbbbhieehhhciehhbgabgdbgahfehidiibihgagfdfiggdafedciaegeeehabfhdghiaigabfdabhgihhbddaacgfedaddfdcheegbcfddifbebbiachcdfddehaehchbaiefcdfgeggeecfdbbgfhbcghddeaeeefaihbdeeeeefiggdgiabadfgiegefibagccaggacedegfggegdebgbgibdfghdidcihfcbcbbhhdbicciabfhiaigfcfcaficgbhidbdfhadgfehhcfdhefigafhfbdcddbbbecfiefecgcgiiifciddcdiidcicbcfgfhaegacahfcdfbcgbedgiehefbddibeefddgdhhiffhhgihhhdcbgehgiecgggecfehiiebdiibabfbchiaifgdddihghcfacgfgcefdeedibfccifaeideceifdhadehdabcfagfccgdgihacaghgdifahehgceebeeaifbhdaihibbifhgcbddabadfaaahifedhgfaaccbhhicccchdgffegaeaaaeaehgacihebecfgagaegbbidfddhagfcaifhgicdfbcaghcgbdhbcahebfdfifageeheggbgfahhifdciicchgeciabhgcgcbdfahfeibbiggaaiadhhedcifidiefihfbfegdbhieghbdacdddbcgbfebfccehccigbcbebdedgdgaahfhfddghfeabadfbgiidgfiifhiafhiedhdhagcfffgeidfhfhabcbcbdcdhbdcgdbefgchahcagfbgcbbeggadfeegccifdfiibcdgdbigbidgegaaccbgdgggcihfiacgiacigeehfdfcedfhhedhbdidegccbcgaadacihcgfcibheiaedefcfdbhcbbcbgcgcabgeiegafgghehcdedigfdhhfaceegbbdeheagheddhbceffhbhhfdhaddcdibbbgegcagdihhhbbifaeciabcggihifbachciaffgaddccdebechhbdceafigfegifggadgdbfgeaghabhidbcbhafhgcghfgbcihifdgdcebhegbffacbcheabidebgaddafihaiaheififgbfgcbicfiaaghbahdgadabfcbibahddechdhddadgaefefbgiahgcefhffehhhhgahihhdcbbcfhiggcbcfbegecfbbdbghbahceaffcbfehifagefcbcdaiaiaaeahiccbghchicaafcbdigbbfaeeaiddbhcdebcdhhbiddhffhhaededgcdaaigfccaddchgfichfeccafgfbadhbdffgcgfffcceefebehcedgfddegidhbfifbidcfffhbegfggfbfbhbfehgghfiigcbfccebddahbagdefidffchaibegigciiiegecchdadieggebchdgifghihfgefhdbegfghbecdfccdffefggbdaiagfbaaahfcicbahaabdiabahgcbcgicgcafccieebceeaihcefgaahegchedceifdbbhdbaheeefffbgedffchiaiaihaafggddebacdihabdfbccfgbhafhiggcabahggehghiceedbebfbceeefhfhaigadafcfgiiiadgeebaeeigibdafcgahhfeahhcghfadiadbbdidcgeghfhbfaicicgafhbeahccdiaidffeiahbgcgdccbhafhiciehgedbabifgciaieehhddefaaicahcfggdidcehfgigdccieahdhfbaefeiieecebbdchdhgcebfeceidcfdfidhhaigfhigadecagffegcabbgiffbfhbhiddchieheaibgagehbigdadhfabegfahagfdbccdggbbdiaeeaebccighcagafdgbfggdhhdchagddcighihefdgbeidiahebiiehdhccbcgdaccgfbahihbcadfgcbcabccdfccaddhdghbffgaebddhicebbefibaeigfagiiafhdbbiffagahiahhegeieeadcecfecbadecdbadigiffbgdehdcbedbiigfidcegfhahchabeidefbadcfbcgdhcfdeeffgdifigcfebgdiaccibbbehadcgieheghebahhiafbbdfehgaiiaadgcaabbdeaacbbfbgigbibeabbfcccgdghabeicdgiecahgahbbfecfbhaeifgdigeeaddggbiffidebfihaecaadcgafaaeehbghbehbgefaibcifbhhgbfcagcdgdgcgieigdahhgcaichaagidfadihhfadgfggfhcaahgggcdhibhcbfdbdecggbffhgdicgeicefiegaccaebccibidfcddibbfdfdebibghbhdccebidifheigabaecicebiffhedgfadcfbbdhhhdbicbchgbffcghdbahbhbegebiccdcdhhgbiciicaebbeccebcddfdefbhiifeecfhdhficdcdhcdaeidifabbaigcbhicaeibfafefchgchchagcagbahghcgaehficeabdieidbifacagcfeefdehiagecaahbahiggahfgageagdecihbedghcegdegfbbiiiigihhgiaaabdidiafdehhiebdcbggihbggiiiafhabaeiceigeebaccbdgdicffefefedghebcgheaidheidifbffaifdddhhccdfciaahaddcdbbdacgfagadiceebfbhihefbcdfhhggdedhiaecdgcebbiibadegccigdhbdeeebbfebgaedcfbfgidgbcfhigahacecdaacihhfcafhfbdadgdgbcggdfcacgbdeaebdafgihaeicaeeiagagcciehdbabchfafahecehbdfcachfabehaaiefdbbaehcigiehbghcdeedbcfcdfgechcgfiiadgdfcideebchcicgdidccgfiaaghhaibeiebfhabhdeeacehgghfaefbhaiefaahibdcagiabgegdeffcdbachdbgdhhbhgfeafdihidhgibihhficabhfeicihebaacbbhicbidiabgaaefgdibhgchdaghagfgiaibedeidbhafiiigibadiccabccecghehdfcfdfgbihiedicadeghbbcaheaiacbbadfcfhgegfihbbgfbhbiihhahfbhfffbihfbbiddifechbahidfiigaifcdfihgacgaebhgeeiigddcheeddcigadcdbibegfcafcdgfibeedicfffaicabggchbibebaidbafhhcgdbdiggigggedheiccbifedgeicfahfdfgeicdgfhedaeicgcfgehibbgaifdgfhaecghhfidhegeihahbghfecagdfcacgfahahhcdcifegfgfcfdbeafbhecfbihecehichheiggaiigeeaeeehagghhafhibibcgdbchiecfheehgcabbbeegibhfddhhcfeeafhchbgcchdfhgcihdggfibdbdidgighichfeiabfggfaggfiddidcahaaaagahdadgegcggicdhahggfbbacaeigfaacfhhebehihbfaedcdbebcagafagbhcfbfaidhgdhefhbieffbaifgabfeacdhbiaggageiiahgiiafhebbbdefebiicbiiggagdcddbcfaafabdfgbchffhdbbeacihehbihgbeihhfdiiedadhfgcccibchdhcefafdggbdhgcccfggbdbbicbbdacdcfccfcfddidcgfbibfighihfafaaghbgbdcacheifgbchagfdcihfhcfacefafhegiagbidcdbbdgcccbabdeaddagcciffgbcbgighbfbaaiahcbefaadffaggicicceedbhbaaeggbibdeegbcdhihhhdgdchdgdiffhfibdbcadecciabagdihgfhgcgadfacgdegafighfhffagghaiifhiiaibffhbhfgdafahiaabaeaaheifgegfffaegbbefacbhchbdifdgcgiacdbffhdbfchbicchcegebefgccedfccdfaegfdhhhefhchehfdfdhaafiifdgddhddadeghhebhidfebhigfbheahcbagcdbhegfadiachdgiahihcfidbceibccafihahdehadcdfcbgdghdbehediiffdbeiiidacfidiififcfcahbdbdfeiddedaedhihdbfabebfgheeghfeaefhgdahiigbcbaehdgedaiedffbehbdfigeiccgcgdifbihdiibgigediehiahfgdhebaghfbgcichfdbeagdbigifbeddihbbgdgaeecidbfgfgfeifbgbcbhdhahdeheaaacbhiceegefidhcdidhiaidhfcbcegccbiidbgafedfaffeiigefifaicagedffefehhahffgaghaeabiaffgdgcdchecebdiddcbgffdgbechbceifiicadbhedaicdcdfhffcaiigfcdeafifbefdgbdfbgdaeigbcfhgibigdcgghdgbhgcbdgfcgfigdifchffcaeahbgcgafhfeeidbdaigciifdgdcgaegdaieiidfhfaecffeacgahfagbbcgbfgghaahfheihdaheihgfiifgeabfbhhagbbaididgbicegdbahbgeffifhdfddeheifhaidcdihfchdaccigffiicdebdgdfdhcfdieghdibaifbddbgfcidaibaeageggfidacfacfgfaeiaifgabddgcfbhacbiaaabcfachgiicfedaeadecdhgabaadgdedfcgiddghaegacddagihbehehhhcfdehehiagcegehighicdbaddhceidihfaihicbdiedgfiecbiieibabbfdhabbcebeadhhbhiaabbcbfehcigcdgaffeifiaccgaichadfifeecdabihfhfhibibeigdiabeibiaacgcdiifefciegigibgbhbdedifccdacdgehhfcdbicgdhafhcfcbegechddieegfghidcgbihcgahficfbdbhcgfgfddaebehgcgfeefcaacbeebhccgcdabaefdichedeeghaidhdiafbaheadccbeigdeeagbbeiiaedifhfcdabfaeicbifagibedaciggcaeahedfbgdcdibbiegbecdcfegbfibgbghbfifdiiafecdhdgaaaibdabbccfdfiaiacgdhchhhahfhicfbaaebefdaegeadecahdcdbahdaibagbehggedhddchgabaigdidedfacdabeedgdfedbffdcidfdehfeffgccagchidaigihgcfcbddbbaccahfdhehdccdcedfeebgfcebgaiahcecddcehgebibieidfecheigecehbfbfefcifbcaeaihbgbgbddceggbihfhfdefhcgaiighbcacfgacagdcchdgaebabcgfehiaehhebbcfbbgcaaihbdhgfbedbiifidfhcdhbdagdihghbehghgidbadebaebachfaeghcadffibiheibeeagdgbceiebfciigighcibdfaeidgbfbiibffabefageeifacaggdgiggfbcagiffhcgiceecfidgfdiihcgahffdhibigafebdhddghagbecgfghcfigdibibiadghgeddichighbciibfbdeieifihcaiibbabghibihhchidcghiabgdehideciechcehaagbgbdchbbafhcdeigdedaafhiiebheehdffaggcgdhececaabbciidhcdbdgcheidbgddbebiieiifcahgfcbdbbachbhihbbiaagfbeheehbffhihiddgggcbciebhcgdaceiaihdgifbcdeciccbfbdcghfeceafhachihcgdaiigccciaegggfbcfdfafidedcdhaaeifhcgfhccbdfcabcigigigggegbdehcfdaiabhabbdbfbaadebgbbehgfbdaghhgiigigdfeecbdhhigdbeiicfefcfeddbeafdicciigcifhfafdbbeibcdghagefaeebgifibaadhaabfaefcegddcabgcbfcfgiehhfgdhdfefgfebiafeeehhadiafaehchccheibcdhiachcciccccdfefhhbiebbcegechcbhahfifbcihbeabicabgeibccgigdidfcedfcfeigiibcdigfecbahgcifgabacgdbcifbeegaeiafagecbcdgdgfigfhheeheefdhaefahbagiifghbicgfhhdaadagfcghdefbdggbaaddhaecdifddiahebaacieiefaahbfifbfgffhdagcihhifcfhdedcgbaacfdhhahhdahhbecceabaedhfaaabdbhfbahbdciiebhdhgcchccieafcgdgefdbfhgicbchiddacdigaddadidegfhggiiddfcfidhgicibdieghchfhecifhafhdefebeidceehddegcicfbdahdcdihbbdghiaecggbbfiegfeehbdcdceddiifgciacaehhdhigfdidbiaheifihffdbaegebhgiggghifhaegefhegbbdhhhidecdbafecgfabdhcabhcgghagfhffifafegdibaaebcegdgciaedfacdgghiihaifaidegcbehhfafgcidbaegcchabhfabdbhifbfhagiidbabiifibfhadeiiiicigigcbbdieafgdcbeiedfdecbaagbiaibhbaheeeceggecbfdieaegccgbfcfceifhhgeadcdhfaecbfbcgfhehdgccgdhhifbbeiedfbhfcfigifhggaffaibaadhbcheiahieaidbhheiecfebiebaicddggibaabeefceggacfdcggebfhghhdbaefdaeggcdbfeeheggigcffcidagehgificbfiededfbhadcdfcabdgcbfbfhiiaidbgbgdifgfdaieiaccafhdfgggbfhehadeddiddadfiigchhhiicfechidiadiffhieghbggfcfaaaacgdgdfbebhecbgdhfcbfcbdgaiaifedfccceacghhefcciahbhbgfdicdhhdeeiadfadfebcbgbhfdhhfifdafibbahacaeheeahaegfadeaigiedcegfdefhhehibhacdgcdceceaaihahfbgadfbaiaedcaedfcgefgaaccahiaebagehiccegfacdeebgdfhbiafechdfeceggdffecafbecfhggcacbebbfbhiieaeieghdcdefegiadhgfdedhaefdadiihichhiacgihfbdhgchgeibfcaacigdeahdcbbciibabbbiifgacfefebicidhbifagadgedaeifciahebcgiddfehgbeidiichaehbgcheifadeicgibbeabcgchgeifegaeagbdffagchaiaecabcfibgahihbicbdgfihedfahibfdicgefbagaghgaghdaiibcfiacdfiaiaecgcgbfdibbcdheccggcggdfghihhhghdbfhaacbfibgehgchgdaeibdiadbicchdcaicfddaciaacdbaadigfadcghcedbbeifaebdafgeechadhfbgagceebacceccffaceghacchgaiicfaaicgiibfdahccidaigcgdiehhcifchabchacfghachicgaifiigcccfcgibfhaihagfddhdgaidchic";
		//String s = "aacaba";
		// ("aac", "aba") -- Good
		// ("aaca", "ba") -- Good
		// ("aa", "caba") -- Bad
		// ("aacab", "a") -- Bad
		System.out.println(mySolution(s));
		
	}
	
	public static int mySolution(String str) {
		
		if(str == null) {
			return 0;
		}
		//char[] chars = str.toCharArray();
		int splitCount = 0;
		int indexPointer = 0;
		
		while(indexPointer < str.length() && str.length() < 100000) {
			
			//int validSplit = splitValidation(str.substring(0, indexPointer+1), str.substring(indexPointer+1, chars.length));

//			String rightStr = str.substring(indexPointer+1, str.length());
//			String leftStr = str.substring(0, indexPointer+1);
//			int leftLength = findDistinctCharCount(leftStr);
//			
//			if(rightStr.length() < leftLength ) {
//				indexPointer++;
//				continue;
//			}
//			int rightLength = findDistinctCharCount(rightStr);
//			if(leftStr.length() < rightLength ) {
//				indexPointer++;
//				continue;
//			}
			
			if(findDistinctCharCount(str.substring(0, indexPointer+1)) 
					== findDistinctCharCount(str.substring(indexPointer+1, str.length()))) {
				splitCount++;
			}
			
//			if(leftLength == rightLength) {
//				splitCount++;
//			}
			indexPointer++;
		}
		return splitCount;
	}
	
	private static int findDistinctCharCount(String str) {
		
		StringBuilder temp = new StringBuilder("");
		for (int i = 0; i < str.length(); i++){
	        char current = str.charAt(i);
	        if (temp.indexOf(String.valueOf(current)) < 0){
	            temp.append(current);
	        }
	    }
		return temp.length();
	}
	
	/**
	 * https://github.com/naresh1406/youtube/blob/master/src/main/cp/leetcode/problems/_1525_Number_of_Good_Ways_to_Split_a_String.java
	 * 
	 * @param s
	 * @return
	 */
	private static int bestSolution(String s) {
		int n = s.length();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Set<Character> preSet = new HashSet();
        Set<Character> sufSet = new HashSet();

        for (int i = 0; i < n; i++) {
            preSet.add(s.charAt(i));
            sufSet.add(s.charAt(n - 1 - i)); // right to left
            prefix[i] = preSet.size();
            suffix[n - 1 - i] = sufSet.size();
        }

        int goodWays = 0;
        for (int i = 1; i < n; i++) {
            if (prefix[i - 1] == suffix[i])
                goodWays++;
        }

        return goodWays;

	}
	
	@SuppressWarnings("unused")
	private static int splitValidation(String left, String right) {

		Set<Character> charsSetLeft = new HashSet<>();
		Set<Character> charsSetRight = new HashSet<>();
		int pointer = 0;
		while(pointer < left.length()) {
			charsSetLeft.add(left.charAt(pointer));
			pointer++;
		}

		pointer = 0;
		while(pointer < right.length()) {
			charsSetRight.add(right.charAt(pointer));			
			pointer++;
		}
		
		if(charsSetLeft.size() != charsSetRight.size()) {
			return 0;
		}
		
		return 1;
	}

}
