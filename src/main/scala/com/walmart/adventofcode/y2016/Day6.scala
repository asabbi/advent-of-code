package com.walmart.adventofcode.y2016

/**
  * http://adventofcode.com/2016/day/6
  */
object Day6 {

  /**
    * Challenge 1
    */
  def message(input: String): String = {
    input.split("\n").map(_.toCharArray())
      .transpose
      .foldLeft(""){
        (result, line) => {
          result + mostFreqChar(line)
        }
      }
  }

  /**
    * Challenge 2
    */
  def messageLeastFreq(input: String): String = {
    input.split("\n").map(_.toCharArray())
      .transpose
      .foldLeft(""){
        (result, line) => {
          result + leastFreqChar(line)
        }
      }
  }

  private def mostFreqChar(input: Array[Char]): Char = {
    input.groupBy(_.toChar).map(p => (p._1, p._2.length)).toSeq.maxBy(i => i._2)._1
  }

  private def leastFreqChar(input: Array[Char]): Char = {
    input.groupBy(_.toChar).map(p => (p._1, p._2.length)).toSeq.minBy(i => i._2)._1
  }

  def main(args: Array[String]): Unit = {
    val input = "tmcezlum\nafzwmyrz\nollxkaqs\noqvdutkr\nufzmsidi\nwnidhqow\nefgwivmh\nendrsvkk\nnraaoczx\nyghmfumn\nfcwrdzyt\nqbbejygt\nohrzbtul\nlmrarckg\nfrzhozsk\nahvqozmk\ncnoxuqjm\nnjudcxbx\nxjeohiim\nsygfjxcx\nfbmchcaa\nqqggrcwq\nvbcgurox\neujzkdmh\nkbpinltk\nposxqzam\nrojnpogl\nzvhruwqw\nhvbrxcky\niqifiukd\nxetwaptt\nqvksnzoe\nnulslfja\ntphqwfte\nddencvfp\nnhabbwcl\njefzkclw\ntxstxeio\nyaaqxpdp\nefewzeqa\nteapznjk\njylnjhnf\njumelmrz\nziarkfwo\nvklsvaca\nuoyzpkbn\noovggzkn\najvmcuon\ngkztjkss\nqnwohfwg\nkxwtvaez\njwavozvo\nqgqbbaoc\nxzdepoxu\nkbxhekyv\nceuqobnx\nqlrejrjz\nfvknhyqb\ntfwsmaei\nofpzikkg\nxggckiou\navcoljdv\nvhzjtrwv\ndyqnywkg\nudobaedh\ngncyxisz\noedldehj\nssmyewfv\nciaphyxw\nfhizpimr\nbjyeqyzh\nowjojbzf\nskdfqaeq\nubspxbix\ntruvdgua\nttvftscb\nqjyxodqz\ncakskune\nokojmtim\nrvrhaprz\niezxilxh\nyalqlefr\nrxygadto\nhdszdagc\nsrqhzltw\nvuinwxvi\njcunlnmn\njxolxqid\nmnnjrghb\njogafqpd\nixdlwxwj\nsttkgdyk\niqfeawey\nzdlukwnn\nodghxddl\neoflpjdw\nhaketaof\nylkfukna\npdwemhut\nryyhsryr\niapyhpba\nwtgsqrtt\nhctctzdi\nulnuyuex\nbpxpdeqb\nitbourhl\ndztqwptk\ngmmsltml\nevnhvtiy\nasjexlfo\nsgxejmmg\nqxbhjpmp\nprauglcy\nbulipmjg\nxjrkceql\nutehzgxa\nltvfsdrj\nlnyazzkp\nddnndirm\nbddvibpq\najxjxdls\nuidqyood\ncjqffbdm\nnzonwmsr\nzmcesyao\nwvfwtwuc\npwuqzzvg\neciaebxq\nvxbuvava\nyhalnneq\npejiyegy\ntsopxjfn\nggzatxrg\nlgnpyiko\neinylipk\ncwtgfpza\nniddiicg\nctqbwhzb\nmzpgsons\naqaxajai\nfkwufqgn\ndglewfob\nxoqdxsnr\nblxnybat\nbohqqthr\nqanfhczt\ngkpxjfrb\nzmewqucy\natuodurb\nsuiitdqe\nusywjzqc\nvoltqnvd\nppstzuzb\nncxkbwul\nhgivkyyq\nbldyxpov\nyvjbraai\nfhqawceq\nnrmjvhnh\nkpwxogac\ntrtzfnkp\npczcsgns\nrfjdromo\nuncmnnjj\neordqsju\nrhvpcncs\nhrokpyig\nbkszmpef\nkrugmwkb\nsyvtsdek\nvigizldv\nvldwtfmv\nckcbqkrf\ndtvjipcw\nampjmdpd\nkcirijwv\nzzufovbr\nolexgnqh\nllxddfsh\nwfnnkivb\ndzvcoxpi\nwpcwuqoc\nnejgfqvm\nmgbjcbst\nuglwuejg\nrwfcpnpp\ndbfycvwm\nhisynlnw\ngglqswni\nwpmiixuf\nrqbfxlef\nlsupxzeu\nuqrzsowl\nxqmgmnyk\ngzdfdbtb\naoyujvtz\nzmhsbsde\nxnmsgyvk\ngszwzotk\nfkbphiti\nlffmpdda\nplotuwbi\nhakfuxeb\ncpqzjdjb\nfoqwhfis\nctevnjly\nbbnuoohx\nzjndqgbv\nftmrakmg\nyphljbse\nvcmmtout\nishcbwpn\noysaacfd\nupawmrwj\ncexlaadr\ncezsoibf\nyydnylal\nmieypczr\nltbuvmfu\nekumekic\nkrbiejuo\ncyweeeht\nlugkftlh\npohkdvai\nxgoxbacm\ningicfit\ndclavjqp\ndnzgfbrc\njssnhcfu\ntxykgvhl\nuwvgyzgz\njecfzcoi\nyaktumqx\noqehhika\nvoqmtwam\nwchhskdh\nkxjzeygs\nkrfjungf\niqamjkgh\najaxlbcr\nmfrdjjwz\njvqfkkjt\nmupueoje\nozvctxzd\nqneodvvw\nzisckhyc\nyxgudchh\noapmbpbc\npyizuqnn\nttnblbho\nxdpiahgx\nlyerpyzv\ndzslbegp\nfvujdszc\nqhuhvkej\nwxktwmez\nirrqradv\nxtbqoxyg\nnhlrfrgy\ngocvpvlp\nbwybesby\nrvewprlo\nelwmmcos\nfertmhyj\nqhxooqtq\ngzdaipgn\nyqfmniyt\ngornoejg\nwqgsxzys\nkxqaletd\nikuvaeft\nessiqowb\nymohhvfu\nkzjynqhe\nooxnssfp\nhpnozozp\nkdxkokxe\nrwredkrn\nznmrmswj\nsvtkdsuu\nibjqwhwi\nmknydjrv\nopchsgmr\ntbyvuatt\nigevmbpk\nexpjknbc\nkzboboox\nusoxsikr\nfizzvucq\nrvjomwnd\nsgfcwqdl\nocacgxpj\nmropbfvf\nxexycbuo\nqngxnnud\nitmenmlm\ndyaqaifs\njwgtqejq\neyeaavrj\nvwyjauhk\nhqajvjkh\nddvhuacy\ngjgrgtll\nmgawuelx\nlmdgzggf\npbtgkvxc\nsvwklnwu\nkvtsovnm\noybxcuqk\nufwkjtlj\nxkrgfyad\nkdgdjzqp\niqdgesbu\nmxpocjsl\nrmwvihpw\nbpbftisr\nkgtgxxqw\nypwjafxu\nhihxitsz\nlnntwahr\nssecoqkz\nynktphtd\nskwfmfpw\nbihrglvz\nxzkjkgjm\ncuozrxqe\nqmcfrurm\ntphowbli\nzvzwyhrv\nvzlfbuor\nvblsrrba\nlakiynlc\nafomthrw\nrbgtoyfq\nahkqljen\ngamoerak\nwumjelwi\nvqimktjy\nlevvfcsq\neuwrqnjp\nfapllntx\nvyzlxslf\nrwhcbrvz\ntxpficpp\nmbwpimjr\nzohppwog\nzdrsdecc\nuaxqlvsh\nykerbsdc\naecktaff\nwrtdufue\ngykyrwcv\nsesrvnsp\nhmopnqyy\ntfuulvec\njdokvsfw\njwkhzpaf\nmjvzffxn\npctkfrtb\nwfiwcoxg\nqodzwvbg\nbrcaggnu\njjjrrtiu\nktkobacy\nnahinlmj\nnszbvcmi\nnfvbldhe\ntjweqfgt\ncrabmuxk\naffxwlpf\nmpominpv\nyufjtaaa\nhzzhmsyx\nplwdkozp\nozbgwwvd\npplerubj\nwzumeuqo\nksynbxaf\nyxeircsj\ngaqlykne\nirsltmrz\njifivecj\nvhwsstkq\nmjiiiuab\nnkimvhvg\nmemuhxrh\ntjvbzypn\nglebcdpn\nzrmcpufo\nimxlujrn\nacftqbcf\nsymmrhuj\nlqkrybxd\njsyxqzqt\nxbqjvjxl\nqwqsvysm\nddjypobl\nrwxyfjby\nwpoiklyi\neiftosiu\ncabwkqhx\nyxtbhlxo\nheismnzr\nyaduhfgm\nnghplvvs\nlwukrqdx\nifjqghtk\nqclffqxm\ncuszvrgk\nocshztws\nhipeodcu\nqnbgnllz\nqsuogdmr\neusogkvt\nrddealkr\nfjrrvsco\nnugopflj\nbhgbdkxs\nfthcqpao\ntkdvyegv\ntbvpgueq\nahfagxlm\ncipkqfxj\nvqqcipuc\nmugdchdl\nwwjpnife\npurpypnv\ncqzunigd\nnlnvjhbd\nhhiqrzod\nfwjhmdij\nwkpvakif\nbjrytvwo\nuosbgqjb\nbdmfzjcy\ndxlqldzl\nakqbtwvs\nwbxschlg\nmrzksrhs\njmvueuih\nebxpjnhp\nllsogwyw\npeyzimia\nmufdkyny\ndlvxntre\ndyfyazrx\naarkcrwe\nqqacegoh\nrbiqykai\ntbnkymsk\nebtsieby\nuhyjeeba\nahpywtnx\ngyvacpuf\nfrcyslud\nmwwnxofu\njzyabbkj\ncctdoztv\njztmavpd\nsacgyoii\ngnqiydic\nggdrerzq\nlduphshn\nhctmpgih\nkqabzyjt\nppkztsay\npnusnowm\nulyvxfkp\nvmlapyyt\nzifxarmp\nvnpzxhjb\nraewumao\nwejyiymi\ngjbdfjzy\nbxhlwziy\nrsqlgthf\nxtkaltqu\nsmiarmpw\nxdypfzem\nyleuggnb\nwgphfsve\nxgqmyqhq\niyfrymtc\nbwhjkhfl\naftctjug\nseibsuof\nngcdnmxw\nltxyudxa\nxpwqkgdl\nhagwixkv\nlhtlmxqw\ndcineqxs\nnzdrjynu\nvmytcguy\nymsuzmox\nlkzvgcgh\ndfjgzjdn\nrvmgejgk\ndcxdrgpz\nbhjsceuv\nnhpllxmo\ngkotvtsu\nuubvdkjg\nzjnerxhq\nbutazmez\nszzvqyzs\nfpchqsei\nxfsvriyr\nvxodutyh\nzsilhmba\nrvacqpwj\nhjewdrtx\nbylcpgfs\nqtntvgfq\nioqldhye\nwlrbwapp\nnlptloss\nznnybfvl\neinvacbu\nkyziepsr\nfthuwmlv\npmkbhvdn\nxuxngboe\ntpoinkzc\nzwbnhlwp\nusuusbin\njiulcmsq\nelcusgvu\nfrclhdyo\npvmirlch\njvrjfxmb\nsxmtcrsw\nccfkmgmw\nmdnibgld\nidmojsza\nhsjvyoua\nsmhwbpax\npgcozahq\ndstdnwle\naiikfrxt\nkmbnsppa\nwsxcbwze\nhqyunies\nmfrxeqyw\nzikpwtqz\nzckxtclz"

    println("Message: " + message(input))
    println("Message: " + messageLeastFreq(input))
  }

}
