package com.zekiuguz.dictionary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Random random = new Random();

    String sdizi[][] = new String[10][2];
    int sayac = 0;
    String kopya[] = new String[10];
    int gortut=0;
    Button sorkel;
    TextView textView4;
    int j = 0;
    String anadizi[][] = new String[1500][3];
    String dizis1[][] = new String[1500][3];
    String dizis2[][] = new String[1500][3];
    String dizis3[][] = new String[1500][3];
    String dizis4[][] = new String[1500][3];
    SharedPreferences sharedPreferences;//anadizi
    int j1 = 0;
    int j2 = 0;
    int j3 = 0;
    int j4 = 0;
    int r;
    TextView textView2;
    TextView textView3;
    TextView textView5;
    int seviye;
    Button onayla;
    Button geri;
    Button ilerle;
    Button ezberle;
    Button seviye1;
    String anadizitutucu[] = new String[4500];
    String sev1dizitutucu[] = new String[4500];
    String sev2dizitutucu[] = new String[4500];
    String sev3dizitutucu[] = new String[4500];
    String sev4dizitutucu[] = new String[4500];
    ScrollView scroll;
    Button ezkel;
    Button geri1;
    Button seviye2;
    Button seviye3;
    Button seviye4;
    int deneme = 0;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int yy = 0;
        if (yy == 0) {
            sharedPreferences = getSharedPreferences("com.zekiuguz.dictionary", Context.MODE_PRIVATE);
            int b = 0;
            String dizi[] = {"pick", "toplamak", "plant", "bitki", "plate", "tabak", "borrow", "ödünç almak", "brave", "cesur", "calendar", "takvim", "carpenter", "marangoz", "carry", "taşımak", "church", "kilise", "coat", "ceket", "daily", "günlük", "dirty", "kirli", "eraser", "silgi", "fall", "son bahar", "fork", "çatal", "habit", "alışkanlık", "engaged", "nişanlı", "enough", "yeterli", "conversation", "sohbet", "seat", "oturmak", "glad", "memnun", "lots", "çok", "sure", "elbette", "graduate", "mezun olmak", "busy", "meşgul", "their", "onların", "these", "bunların", "decide", "karar vermek", "neighbour", "komşu", "nose", "burun", "opposite", "zıt", "pet", "evcil hayvan", "pocket", "cep", "polite", "kibar", "push", "itmek", "river", "ırmak", "road", "yol", "rose", "gül", "shelf", "raf", "ship", "gemi", "shirt", "gömlek", "shoe", "ayakkabı", "sick", "hasta", "sky", "gökyüzü", "spoon", "kaşık", "thirsty", "susamış", "tidy", "düzenlemek", "town", "kasaba", "underwear", "iç çamaşırı", "wind", "rüzgar", "abroad", "yurtdışı", "accept", "kabul etmek", "accident", "kaza", "anniversary", "yıl dönümü", "ant", "karınca", "argue", "tartışmak", "bell", "zil", "bite", "ısırmak", "cap", "kasket", "catch", "yakalamak", "chance", "şans", "chess", "satranç", "climb", "tırmanmak", "collect", "toplamak", "confused", "kafası karışık", "connect", "bağlanmak", "quick", "hızlı", "refrigerator", "buzdolabı", "arm", "kol", "rent", "kiralamak", "repair", "tamir etmek", "restroom", "tuvalet", "rice", "pirinç", "ring", "yüzük", "heart", "kalp", "horror", "korku", "large", "geniş", "laugh", "gülmek", "lend", "ödünç vermek", "letter", "mektup", "meal", "yemek", "miss", "özlemek", "mistake", "hata", "between", "arasında", "poem", "şiir", "pretty", "sevimli", "price", "fiyat", "produce", "üretmek", "reach", "ulaşmak", "cave", "mağara", "bias", "ön yargı", "blade", "bıçak", "cheerful", "neşeli", "chestnut", "kestane", "chilly", "soğuk", "chimney", "baca", "choke", "boğmak", "afraid", "korkmuş", "alone", "yalnız", "answer", "cevap vermek",
                    // ilk 100
                    "bill", "hesap", "boil", "kaynama", "cease", "durdurmak", "celebration", "kutlama", "chapter", "bölüm", "charity", "yardım severlik", "chose", "kovalamak", "cheeky", "yüzsüz", "bawl", "bağırmak", "their", "onların", "kind", "kibar", "rich", "zengin", "far", "uzak", "unemployed", "işsiz", "freelancer", "serbest çalışan", "soldier", "asker", "grocer", "bakkal", "surgeon", "cerrah", "floris", "çiçekçi", "locksmith", "çilingir", "shepherd", "çoban", "priest", "papaz", "tailor", "terzi", "sailor", "denizci", "chemist", "eczacı", "baker", "fırıncı", "retired", "emekli", "to", "-e doğru", "make", "yapmak", "say", "söylemek", "get", "almak", "take", "almak", "give", "vermek", "leave", "ayrılmak", "put", "koymak", "keep", "tutmak", "let", "izin vermek", "believe", "inanmak", "consider", "değerlendirmek", "apear", "görünmek", "expect", "beklemek", "stay", "kalmak", "fall", "düşmek", "reach", "ulaşmak", "turn on", "açmak", "worry", "endişe etmek", "thick", "kalın", "thin", "ince", "narrow", "dar", "often", "sık sık", "hurry", "acele etmek", "company", "şirket", "member", "üye", "law", "kanun", "reason", "neden", "for her family", "ailesi için", "regret", "pişmanlık", "noon", "öğle vakti", "sunrise", "gün doğumu", "midnight", "gece yarısı", "ill", "hasta", "thinks", "düşünüyor", "us", "biz", "bought", "satın almak", "ı think", "bence", "beans", "fasulye", "cabbage", "lahana", "carrot", "havuç", "chili", "acı biber", "garlic", "sarımsak", "lettuce", "marul", "prickly", "dikenli", "quince", "ayva", "peaceful", "huzurlu", "flat", "daire", "yard", "bahçe", "pool", "havuz", "gate", "bahçe kapısı", "floor", "zemin", "wall", "duvar", "hallway", "koridor", "living room", "oturma odası", "cooker", "ocak", "oven", "fırın", "desk", "çalışma masası", "tub", "küvet", "tup", "musluk", "sink", "lavabo", "towel", "havlu", "knife", "bıçak", "furniture", "mobilya", "experience", "deneyim", "few", "az", "only", "sadece", "also", "ayrıca", "pollution", "kirlilik", "comment", "yorum", "half", "yarım", "foreign", "yabancı", "sales", "satış",
                    //200
                    "support", "destek","utilize", "yararlanmak", "order", "emir-sipariş", "preference", "tercih", "passionate", "tutkulu", "enthusiastic", "hevesli", "wave", "dalga", "feature", "özellik", "emphasis", "vurgu", "fabulous", "harika", "fresh", "taze", "variety", "çeşitlilik", "previous", "önceki", "preparation", "hazırlık", "task", "görev", "allocation", "tahsis", "apprentice", "çırak", "promoted", "terfi", "scales", "terazi", "snack", "abur cubur", "disruption", "bozulma", "instructor", "eğitmen", "benefit", "yarar", "exceptional", "olağanüstü", "implement", "uygulamak", "individual", "bireysel", "punctual", "dakik", "wonder", "merak etmek", "available", "mevcut", "certainly", "kesinlikle", "whole", "tüm", "upcoming", "yaklaşan", "bother", "dert", "intent", "niyet", "confident", "özgüvenli", "interest", "faiz", "particularly", "özellikle","especially","özellikle", "purpose", "amaç", "piece", "parça", "persuasion", "ikna", "whether", "ikisinden biri", "necessary", "gerekli", "modest", "mütevazı", "consumer", "tüketici", "dull", "sıkıcı", "investment", "yatırım", "invention", "buluş", "sell", "satmak", "almost", "neredeyse", "however", "fakat", "trust", "güven", "profitable", "karlı", "honest", "dürüst", "juggling", "hokkabazlık", "pottery", "çömlekçilik", "waste", "atık", "claim", "iddia", "journey", "seyahat", "soul", "ruh", "satisfy", "tatmin etmek", "explain", "açıklamak", "burn", "yakmak", "disabled", "engelli", "village", "köy", "stage", "sahne", "effort", "çaba", "act", "davranmak", "right now", "şu anda", "in front of", "önünde", "yelling", "bağırmak", "same", "aynı", "nowadays", "bu aralar", "abolish", "iptal etmek", "abuse", "kötüye kullanmak", "accent", "şive", "access", "giriş", "accumulate", "biriktirmek", "accused", "sanık", "accustom", "alıştırmak", "bucket", "kova", "brow", "alın", "bride", "gelin", "bribe", "rüşvet", "breast", "göğüs", "brake", "fren", "admission", "kabul", "adverse", "zıt", "alter", "değiştirmek", "ally", "anlaşma", "amend", "düzenleme", "ample", "geniş", "contact", "irtibata geçmek", "cost", "maliyet", "cotton", "pamuk", "cough", "öksürmek", "curious", "meraklı", "cute", "şirin", "decide", "karar vermek", "describe", "tanımlamak",
                    //300
                    "direction", "yön vermek", "discover", "keşfetmek", "discuss", "tartışmak","distrub", "rahatsız etmek", "drawer", "çekmece", "earring", "küpe", "elbow", "dirsek", "elevator", "asansör", "entertainment", "eğlence", "equal", "eşit", "escape", "çıkış/kaçış", "exhausted", "çok yorgun", "experience", "deneyim", "eyebrow", "kaş", "eyelash", "kirpik", "eyelid", "göz kapağı", "feel", "hissetmek", "female", "kadın", "finger", "parmak", "finish", "bitirmek", "fire", "ateş", "flight", "uçuş", "float", "şamandıra", "flower", "çiçek", "food", "yemek", "foot", "ayak", "fork", "çatal", "freedom", "özgürlük", "friend", "arkadaş", "frown", "kaş çatmak", "fruit", "meyve", "fun", "eğlence", "furniture", "mobilya", "future", "gelecek", "garbage", "çöp", "hammer", "çekiç", "flag", "bayrak", "fog", "sis", "future", "gelecek", "glove", "eldiven", "guide", "rehber", "harmful", "zararlı", "insect", "böcek", "invite", "davet etmek", "jam", "reçel", "jar", "kavanoz", "joke", "şaka", "kick", "tekme", "knee", "diz", "lake", "göl", "lamb", "kuzu", "leather", "deri", "leg", "bacak", "lift", "asansör", "lip", "dudak", "meat", "et", "mend", "tamir etmek", "nail clippers", "tırnak makası", "naughty", "yaramaz", "nervous", "endişeli", "noise", "ses", "novel", "roman", "overweight", "kilolu", "pick", "toplamak", "plant", "bitki", "plate", "tabak", "poem", "şiir", "pretty", "sevimli", "price", "fiyat", "produce", "üretmek", "reach", "ulaşmak", "refuse", "reddetmek", "reply", "cevaplamak", "rock", "kaya", "rope", "ip", "rude", "kaba", "rule", "kural", "salary", "maaş", "select", "seçmek", "sharp", "keskin", "simple", "basit", "shine", "parlamak", "shoulder", "omuz", "shout", "bağırmak", "sign", "imza atmak", "silent", "sessiz", "ski", "kayak", "soap", "sabun", "storm", "fırtına", "taste", "tatmak", "tent", "çadır", "throw", "atmak", "tissue", "kağıt mendil", "tongue", "dil", "trouble", "dert", "vacation", "tatil", "valuable", "değerli", "warm", "ılık", "gift", "hediye", "glasses", "gözlük",
                    //400
                    "glove", "eldiven", "glue", "yapıştırıcı", "goal", "hedef", "gold", "altın", "government", "hükümet","grape", "üzüm", "grass", "çim", "guitar", "gitar", "hair", "saç", "hall", "koridor", "anticipate", "tahmin etmek", "anxiously", "endişeli", "camel", "deve", "carefree", "kaygısız", "carrier", "kurye", "caterpillar", "tırtıl", "caution", "uyarı", "aspect", "hal-çehre-durum", "rare", "nadir", "on my own", "kendi başıma", "suitable", "uygun", "rise", "yükselmek", "pupil", "öğrenci-çırak", "announcement", "duyuru", "homeless", "evsiz", "volunteer", "gönüllü", "income", "gelir", "addict", "bağımlı", "patient", "sabırlı", "careful", "dikkatli", "both", "ikisi birden", "employer", "işveren", "opinion", "görüş-fikir", "appropriate", "uygun", "dishes", "bulaşık", "grow", "büyümek", "around", "etrafında", "exciting", "heyecan verici", "famous", "ünlü", "after all", "nihayet", "delicious", "lezzetli", "have a nap", "şekerleme yapmak", "look like", "benzemek", "relation", "ilişki-bağ", "bathroom", "banyo", "guest", "misafir", "hall", "salon", "kitchen", "mutfak", "roof", "çatı", "attic", "çatı katı", "basement", "bodrum katı", "armchair", "koltuk", "couch", "kanepe", "chair", "sandalye", "carpet", "halı", "curtain", "perde", "quilt", "yorgan", "blanket", "battaniye", "cushion", "yastık","pillow","yastık", "çarşaf", "sheet", "fridge", "buzdolabı", "onion", "soğan", "parsley", "maydanoz", "pumpkin", "kabak", "seed", "çekirdek", "radish", "turp", "sweet", "tatlı", "vegetable", "sebze", "zucchini", "kabak", "almond", "badem", "apricot", "kayısı", "peel", "kabuk", "berry", "dut", "cherry", "kiraz", "fig", "incir", "fruit", "meyve", "grape", "üzüm", "pear", "armut", "plum", "erik", "afternoon", "öğleden sonra", "lunch", "öğle yemeği", "one hundred", "100", "one thousand", "1000", "is anybody home", "evde kimse var mı", "then yours", "seninkinden", "there", "orada", "pronounced", "telaffuz", "expressing", "ifade etmek", "keen", "meraklı", "fond", "düşkün", "can't stand", "katlanamamak", "the red one", "kırmızı olan", "latest", "en son", "wide", "geniş", "brood", "geniş", "loud", "gürültülü", "heavy", "ağır", "shallow", "sığ", "generous", "cömert",
                    //500
                    "shut", "kapalı", "loose", "bol", "few", "az", "alive", "canlı", "pleasant", "hoş", "excellent", "mükemmel","terrible", "berbat", "fair", "adalet", "hold", "tutmak", "getirmek", "brign", "happen", "olmak", "provide", "sağlamak", "sit", "oturmak", "stand", "durmak", "pay", "ödemek", "lead", "yön vermek", "allow", "izin vermek", "spend", "harcamak", "offer", "taklit etmek", "waiter", "garson", "journalist", "gazeteci", "judge", "hakim", "butcher", "kasap", "architect", "mimar", "reporter", "muhabir", "plumber", "su tesisatçısı", "author", "yazar", "divorced", "boşanmak", "marry", "evli", "warning", "uyarı", "accomodation", "konaklama", "admire", "hayran olmak", "adopt", "evlat edinmek", "adult", "yetişkin", "advertisement", "reklam", "advice", "tavsiye", "affection", "şevkat", "afford", "maddi gücü yetmek", "trait", "karakter", "mustache", "bıyık", "decent", "terbiyeli", "host", "ev sahibi", "neat", "düzenli", "sculpture", "heykel", "pray", "dua etmek", "holy", "kutsal", "guess", "tahmin etmek", "sightseeing", "gezi", "souvenirs", "hediyelik eşya", "skill", "beceri", "deaf", "sağır", "request", "rica etmek", "recommend", "tavsiye", "stained", "lekeli", "trail", "iz", "accros", "karşısında", "greeting", "selamlama", "pleased", "memnun", "october", "ekim", "near", "yakın", "trip", "seyahat", "says", "diyor", "launches", "fırlatma", "satellite", "uydu", "orbit", "yörünge", "still", "hala", "expendable", "gözden çıkarılabilir", "congrats", "tebrikler", "amount", "miktar", "deployment", "dağılım", "spirit", "ruh", "pressure", "baskı altında", "target", "hedef", "annual", "yıllık", "apologize", "özür dilemek", "appear", "ortaya çıkmak", "application", "başvuru", "apply", "başvurmak", "appointment", "randevu", "army", "ordu", "arrange", "ayarlamak", "ashamed", "utanmış", "attend", "katılmak", "attention", "dikkat", "attract", "çekmek", "behave", "davranmak", "belief", "inanç", "belong", "ait olmak", "bet", "bahis", "bleed", "kanamak", "bone", "kemik", "brand", "marka", "brief", "kısa", "bright", "parlak", "bulb", "ampul", "burglar", "soyguncu", "calm", "sakin", "certain", "kesin", "citizen", "vatandaş", "coast", "kıyı",
                    //600
                    "comb", "tarak", "common", "yaygın", "compare", "kıyaslamak", "complain", "şikayet etmek", "consist", "oluşmak","contain", "içermek", "convince", "ikna etmek", "november", "kasım", "count", "saymak", "crime", "suç", "criticize", "eleştiri yapmak", "curtain", "perde", "decrease", "azalmak", "defend", "savunmak", "destination", "varış", "destroy", "yok etmek", "discount", "indirim", "disease", "hastalık", "dive", "dalmak", "divide", "bölmek", "duty", "görev", "earthquake", "deprem", "engine", "motor", "environment", "çevre", "event", "etkinlik", "excuse", "mazaret", "expect", "ummak", "explosion", "patlama", "fear", "korkmak", "field", "tarla", "fist", "yumruk", "fold", "katlamak", "force", "güç", "forgive", "affetmek", "funeral", "cenaze", "gentle", "nazik", "governor", "vali", "guilty", "suçlu", "harbour", "liman", "hide", "saklamak", "hope", "umut etmek", "host", "misafir etmek", "humour", "espri", "hurt", "incitmek", "imagine", "hayal etmek", "import", "ithal etmek", "improve", "geliştirmek", "ink", "mürekkep", "insist", "ısrar etmek", "invent", "icat etmek", "invest", "yatırım yapmak", "jealous", "kıskanç", "jewel", "mücevher", "law", "yasa", "leaf", "yaprak", "lie", "yalan söylemek", "liquid", "sıvı", "luggage", "bagaj", "measure", "ölçmek", "mind", "akıl", "minister", "bakan", "mosque", "cami", "murder", "cinayet", "muscle", "kas", "neck", "boyun", "obey", "itaat etmek", "offer", "teklif etmek", "owe", "borcu olmak", "pain", "ağrı", "palace", "saray", "permission", "izin", "pig", "domuz", "pill", "hap", "poison", "zehir", "pregnant", "hamile", "private", "özel", "promise", "söz vermek", "protect", "korumak", "protest", "protesto etmek", "public", "halka açık", "publish", "yayınlamak", "punish", "cezalandırmak", "purchase", "satın almak", "purpose", "amaç", "quit", "bırakmak", "rate", "oran", "realize", "fark etmek", "recover", "iyileşmek", "remind", "hatırlatmak", "remove", "ortadan kaldırmak", "resign", "istifa etmek", "responsible", "sorumlu", "seatbelt", "emniyet kemeri", "secret", "sır", "shoot", "vurmak", "shoplifting", "hırsızlık", "signature", "imza", "silk", "ipek", "size", "beden", "skin", "ten",
                    //700
                    "sneeze", "hapşırmak", "snore", "horlamak", "solve", "çözmek", "space", "uzay", "spy", "casus", "stare", "dik dik bakmak","stationery", "kırtasiye", "steal", "çalmak", "steward", "hostes", "stomach", "mide", "strange", "garip", "stranger", "yabancı", "sudden", "ani", "suffer", "acı çekmek", "suggest", "önermek", "survive", "hayatta kalmak", "tail", "kuyruk", "temporary", "geçici", "tiny", "küçücük", "tool", "alet", "trade", "ticaret", "truck", "kamyon", "tyre", "lastik", "vote", "oy kullanmak", "wish", "dilek", "accuse", "suçlamak", "achievement", "başarı", "adjust", "ayarlamak", "admit", "kabul etmek", "affair", "ilişki", "agriculture", "tarım", "aisle", "geçit", "article", "makale", "casting", "kalıba dökme", "grain", "tahıl", "dear", "sevgili", "colleague", "iş arkadaşı", "deserve", "hak etmek", "treasure", "değer vermek", "voyage", "yolculuk", "memorize", "ezberlemek", "hired", "işe alınmış", "traitor", "hain", "evidence", "kanıt", "leaked", "sızdırılmış", "crap", "saçmalık", "worst", "en kötü", "allowance", "nafaka", "ambassador", "büyük elçi", "apparent", "açık", "appreciate", "takdir etmek", "approve", "onaylamak", "arrest", "tutuklamak", "audience", "seyirci", "avoid", "uzak durmak", "bankrupt", "iflas etmek", "bargain", "pazarlık etmek", "beg", "yalvarmak", "beggar", "dilenci", "blame", "suçlamak", "breath", "nefes", "budget", "bütçe", "candidate", "aday", "cemetery", "mezarlık", "charming", "çekici", "client", "müşteri", "coal", "kömür", "commerce", "ticaret", "deceive", "aldatmak", "competition", "rekabet", "concentrate", "konsantre olmak", "condition", "durum", "confess", "itirafta bulunmak", "consider", "değerlendirmek", "construction", "inşaat", "consult", "danışmak", "contest", "yarışma", "contribute", "katkıda bulunmak", "convert", "dönüştürmek", "court", "mahkeme", "crossword", "bulmaca", "cruel", "zalim", "deadline", "son tarih", "declare", "ilan etmek", "define", "tanımlamak", "desire", "arzu etmek", "diagnose", "teşhis", "disappear", "ortadan kaybolmak", "disappoint", "hayal kırıklığına uğramak", "distance", "mesafe", "distribution", "dağıtım", "dreadful", "korkunç", "eager", "hevesli", "encourage", "teşvik etmek", "enterprise", "işletme", "envy", "imrenmek", "essay", "makale", "estimate", "tahmin etmek", "evaluate", "değerlendirmek", "exaggerate", "abartmak",
                    //800
                    "examine", "gözden geçirmek", "exhibition", "sergi", "experiment", "deney", "fence", "çit", "fix", "düzeltmek", "fluent", "akıcı", "foolish", "aptal","forecast", "tahmin etmek", "fragile", "kırılgan", "frame", "çerçeve", "frequent", "sık", "gamble", "kumar oynamak", "gear", "vites", "grateful", "minnettar", "harvest", "hasat etmek", "hesitate", "tereddüt etmek", "hire", "kiralamak", "in advance", "önceden", "increase", "artmak", "independent", "bağımsız", "inflation", "enflasyon", "innocent", "masum", "inspection", "muayene", "inspector", "müfettiş", "insurance", "sigorta", "invoice", "fatura", "kidnapping", "adam kaçırma", "knowledge", "bilgi", "landlord", "ev sahibi", "vest", "yelek", "verification", "doğrulama", "least", "en az", "wireless", "kablosuz", "reasoning", "akıl yürütme", "definition", "tanım", "dwarf", "cüce", "trash", "çöp", "shaving", "traş olmak", "curiosity", "merak", "expand", "genişletmek", "compatible", "uygun", "surely", "kesinlikle", "ignore", "aldırmamak", "bend", "bükmek", "aware", "farkında olmak", "useful", "kullanışlı", "civilization", "medeniyet", "actually", "aslında", "peace", "barış", "just", "sadece", "sincerely", "içtenlikle", "strive", "çabalamak", "pity", "merhamet", "any time", "istediğin zaman", "loan", "borç", "magnificent", "mükemmel", "maintain", "sürdürmek", "marvelous", "harika", "massive", "muazzam", "mention", "bahsetmek", "nation", "ulus", "objective", "amaç", "observe", "gözlemek", "obvious", "apaçık", "opportunity", "fırsat", "participate", "katılmak", "percentage", "yüzde", "persuade", "ikna etmek", "postpone", "ertelemek", "process", "süreç", "profit", "kar", "prohibit", "yasaklamak", "property", "mülk", "proposal", "teklif", "prove", "kanıtlamak", "publicity", "reklam", "quantity", "reklam", "quarrel", "bozuşmak", "queue", "kuyruk", "receipt", "fatura", "receive", "kabul etmek", "recognize", "tanımak", "recommend", "tavsiye etmek", "reduce", "azaltmak", "reject", "reddetmek", "release", "serbest bırakmak", "religion", "din", "reluctant", "gönülsüz", "rely", "güvenmek", "represent", "temsil etmek", "resolution", "karar", "resource", "kaynak", "respond", "yanıt vermek", "revenue", "gelir", "revise", "gözden geçirmek", "rub", "ovalamak", "sand", "kum", "schedule", "program", "seek", "aramak", "sense", "his",
                    //900
                    "shake", "sallamak", "share", "pay", "skyscraper", "gökdelen", "strike", "vurmak", "substitute", "yedek", "suppose", "farz etmek", "swear", "yemin etmek", "tax", "vergi", "throat", "boğaz", "urgent", "acil","to book", "rezervasyon yapmak", "torture", "işkence yapmak", "trick", "hile", "treatment", "tedavi", "violent", "şiddetli", "volunteer", "gönüllü", "wealthy", "varlıklı", "weapon", "silah", "whistle", "ıslık çalmak", "wholesale", "toptan satış", "witness", "görgü tanığı", "zip", "fermuar", "even", "bile", "them", "onlara", "then", "sonra", "those", "şunlar", "abandon", "terk etmek", "able", "yetenekli", "abortion", "kürtaj", "absolute", "mutlak", "accompany", "eşlik etmek", "account", "hesap", "advice", "öğüt vermek", "advocate", "savunucu", "despite", "aksine", "devastation", "yıkım", "diver", "dalgıç", "case", "vaka", "foreman", "ustabaşı", "ambition", "hırs", "glitch", "kusur", "congested", "sıkışık", "perhaps", "belki", "heatwave", "sıcak hava dalgası", "distance", "mesafe", "vehicle", "araç", "less", "az", "flagrant", "bariz", "behind", "arka", "destruction", "yıkım", "title", "başlık", "reduction", "kesinti", "overhaul", "bakım", "incentive", "teşvik", "shift", "vardiya", "consumption", "tüketim", "velocity", "hız", "hubris", "kibir", "mind", "akıl", "probably", "muhtemelen", "jail", "hapishane", "east", "doğu", "weed", "esrar", "sponge", "sünger", "genius", "dahi", "honor", "onur", "weird", "garip", "forbidden", "yasak", "coup", "darbe", "wildfire", "orman yangını", "blaze", "alev", "flame", "alev", "during", "sırasında", "said", "söz konusu", "oblige", "mecbur etmek", "broad", "kalın", "daylight", "gündüz", "port", "liman", "explosion", "patlama", "brook", "dere", "bridge", "köprü", "chicken", "tavuk", "nut", "fındık", "mushroom", "mantar", "abandon", "terk etmek", "unable", "aciz", "above", "üzerinde", "absence", "yokluk", "absent", "mevcut değil", "absolute", "kesin", "absorb", "emmek", "accidentally", "kazara", "so", "bu yüzden", "or", "veya", "few", "az", "holiday", "tatil", "tonight", "bu gece", "soon", "yakında", "in a hour", "1 saat içinde", "nap", "uyku",
                    //1000
                    "everyone", "herkes", "talent", "yetenek", "plain", "ova", "later", "sonra", "what kind of", "ne tür", "no way", "yok artık", "more or less", "aşağı yukarı", "it sounds good", "kulağa hoş geliyor", "guess what", "bil bakalım ne oldu", "indulgent", "anlayışlı", "don't mention", "lafını bile etme","I don't mind", "umrumda değil", "if I where you", "senin yerinde olsaydım", "It's better than nothing", "hiç yoktan iyidir", "leave me alone", "beni yalnız bırak", "outside", "dışarda", "climate", "iklim", "largest", "en büyük", "smelly", "kokmuş", "crucial", "hayati", "never mind", "boşver", "watch out", "dikkatli ol", "why not", "neden olmasın", "forget about it", "unut gitsin", "hurry up", "çabuk ol", "take it easy", "rahat ol", "calm down", "sakin ol", "cheer up", "neşelen", "hold on", "bekle", "not yet", "henüz değil", "suit", "takım elbise", "knight", "şövalye", "forward", "ileri", "side", "yan", "decision", "karar", "forever", "sonsuza dek", "special", "özel", "swamp", "bataklık", "situation", "durum", "demonize", "şeytanlaştırmak", "told", "söylemek", "hurt", "acıtmak", "together", "birlikte", "once upon a time", "bir zamanlar", "hug", "sarılmak", "in charge", "sorumlu", "delicate", "hassas", "balance", "denge", "forget", "unutmak", "yet", "henüz", "headache", "baş ağrısı", "doll", "oyuncak bebek", "awful", "berbat", "did you watch", "izledinmi", "must", "zorunlu", "spite", "inat", "injury", "incinme", "rest", "dinlenme", "the other day", "geçen gün", "once", "bir zamnalar", "leap","sıçramak", "upset", "üzgün", "shine", "parlamak", "flee", "kaçmak", "overcome", "üstesinden gelmek", "sweep", "süpürmek", "arise", "yükselmek", "lean", "eğilmek", "strike", "saldırmak", "perhaps", "belki", "belong", "ait olmak", "laps", "tur", "wheel", "tekerlek", "ark", "gemi", "realize", "fark etmek", "toes", "ayak parmakları", "disgusting", "iğrenç", "creature", "yaratık", "starve", "açlıktan ölmek", "deal", "anlaşma", "brick", "tuğla", "ridiculous", "aptalca", "occasionally", "bazen", "cell", "hücre", "blind", "kör", "scare", "korkmak", "kiosk", "büfe", "beer", "bira", "flood", "sel", "quitter", "dönek", "caring", "şevkatli", "anymore", "artık", "bug", "böcek", "gorgeous", "muhteşem", "pride", "gurur", "warn", "uyarmak", "disgrace", "rezalet", "servant", "hizmetkar", "authority", "yetki", "repent", "tövbe etmek",
                    //1100
                    "wise", "bilge", "liberty", "özgürlük", "fancy", "süslü", "incredible", "inanılmaz", "You're welcome", "rica ederim", "somewhere", "bir yerde", "ashes", "kül", "forest", "orman", "insane", "çılgın", "noisy", "gürültülü", "fired", "işten çıkarmak", "closer", "daha yakın","painful", "acı verici", "shore", "sahil", "chum", "oda arkadaşı", "till", "kadar", "crowd", "kalabalık", "dodge", "atlatmak", "bit", "kiraz", "strain", "gerginlik", "curve", "eğri", "aged", "yaşlı", "aid", "yardım", "aim", "hedef", "alarming", "korkutucu", "along", "boyunca", "alongside", "yanısıra", "actual", "gerçek", "although", "rağmen", "altogether", "tamamen", "among", "arasında", "amuse", "eğlendirmek", "ancient", "eski", "angle", "açı", "adequate", "yeterli", "advertising", "ilan", "advertise", "duyurmak", "without", "olmadan", "handle", "üstesinden gelmek", "eventually", "eninde sonunda", "how is it going", "nasıl gidiyor", "give me a hand", "yardım et", "get out of here", "defol buradan", "broke", "parasız", "it is beyond me", "bu beni aşar", "it is up to you", "sen bilirsin", "let's go to the point", "sadede gelelim", "alligator", "timsah", "ankle", "ayak bileği", "announce", "duyurmak", "annoy", "kızdırmak", "annoying", "can sıkıcı", "annoyed", "sinirlenmiş", "anxiety", "kaygı", "anxious", "endişeli", "anyone", "kimse", "anyway", "neyse", "wisdom", "bilgelik", "missing", "kayıp", "traditional", "geleneksel", "coronation", "taç giyme töreni", "worth a shot", "denemeye değerdi", "hook", "kanca", "mayor", "belediye başkanı", "reward", "ödül", "tissue", "doku", "sibling", "kardeş", "gotta", "zorunda", "cost", "maliyet", "shake", "sallamak", "shoot", "film çekmek", "show", "göstermek", "illness", "hastalık", "wax", "ağda", "documentary", "belgesel", "silence", "sessizlik", "as", "gibi", "remain", "kalmak", "thus", "böylece", "appeal", "başvuru", "kid", "şaka yapmak", "justify", "savunmak", "deception", "aldatmak", "consider it done", "oldu bil", "gardener", "bahçıvan", "paradise", "cennet", "extraordinary", "olağanüstü", "each other", "birbirini", "giraffe", "zürafa", "view", "görünüm", "worth", "bedel", "ordinary", "sıradan", "so be it", "öyle olsun", "after you", "önden buyrun", "bless you", "çok yaşa", "here you are", "buyrun", "it's my turn", "benim sıram", "my treat", "benden olsun", "whenever", "her ne zaman", "appoint", "tayin etmek",
                    //1200
                    "appointment", "randevu", "appreciate", "takdir etmek", "approach", "yaklaşım", "approval", "onay", "thaw", "erimek", "species", "tür", "doorbell", "kapı zili", "excruciating", "dayanılmaz", "date", "tarih", "fool", "aptal", "I mean", "yani", "briefly", "kısaca", "abstract", "öz", "since", "dan beri", "recognize", "tanımak","damn it", "lanet olsun", "relapse", "tekrar hata yapmak", "it's over", "sona erdi", "blew", "patlamak", "charm", "cazibe", "casual", "sıradan", "bump", "çarpmak", "bump into", "rastlamak", "encounter", "rastlamak", "schedule", "program yapmak", "stalker", "takipçi", "affectionate", "sevecen", "constitution", "anayasa", "barely", "zar zor", "stuff", "şey", "wanna", "istiyorum", "kind of", "gibi", "even", "bile", "slightly", "azıcık", "boundary", "sınır", "pursuit", "uğraş", "purple", "mor", "what are the odds", "tesadüfe bak", "dip", "sos", "sweaty", "terli", "interrupting", "bölmek", "solid", "sağlam", "own", "kendi", "during", "o esnada", "when", "-dığında", "while", "-iken", "under", "altında", "close to", "yakınında", "on", "üstünde", "next to", "yakınında", "into", "içinde", "outside", "dışında", "more", "daha", "previous", "önceki", "fat", "şişman", "silver", "gümüş", "least", "en az", "at least", "en azından", "cuddling", "sarılmak", "missed", "kaçırmak", "lame", "ezik", "recess", "ara vermek", "gotta", "zorunda", "sincere", "samimi", "jackass", "ahmak", "recipe", "tarif", "tape", "kaset", "rewind", "geri sarmak", "mess", "karışıklık", "approximate", "yaklaşık", "arrange", "düzenlemek", "arrival", "varış", "arrive", "varmak", "arrow", "ok", "artificial", "yapay", "benefit", "kâr", "track", "iz", "impact", "etki", "comma", "virgül", "previously", "önceden", "council", "meclis", "trousers", "pantolon", "lose", "kaybetmek", "disaster", "felaket", "make", "yapmak", "say when", "dur de", "say uncle", "pes et", "says who", "kim demiş", "never say die", "sakın pes etme", "you don't say", "hadi canım", "aside", "bir kenara", "aside from", "den başka", "fall asleep", "uyuyakalmak", "assist", "yardım", "assume", "üstlenmek", "assure", "garanti etmek", "recently", "son zamanlarda", "lately", "son zamanlarda", "I have just", "daha yeni", "evaporate", "buharlaşmak",
                    //1300
                    "slippery", "kaygan", "sunny", "güneşli", "broke", "parasız", "it doesn't matter", "sorun değil", "don't piss me off", "beni kızdırma", "get well soon", "geçmiş olsun", "are you kidding me", "benimle dalga mı geçiyorsun", "as soon as possible", "mümkün olan en kısa sürede", "by the way", "bu arada", "mind your business", "kendi işine bak", "sooner or later", "er yada geç", "don't bother", "zahmet etme", "what a shame", "yazık", "shame on you", "yazıklar olsun", "who cares", "kimin umrunda", "for your sake", "senin iyiliğin için", "so far so good", "şimdilik her şey yolunda", "here we go", "başlıyoruz","long story short", "kısaca", "worst case scenario", "en kötü ihtimalle", "my bad", "benim hatam", "deal with it", "toparla kendini", "how come", "nasıl olurda", "hang out", "takılmak", "consistently", "sürekli", "sucker", "enayi", "someone", "biri", "sample", "örnek", "speech", "konuşma", "mankind", "insanoğlu", "convincing", "ikna edici", "struggle", "mücadele etmek", "draw", "berabere", "drawback", "dezavantaj", "klutzy", "beceriksiz", "awesome", "süper", "attaboy", "aferin", "heaven", "cennet", "jealous", "kıskanç", "outrage", "rezalet", "immediately", "derhal", "demand", "talep etmek", "mutual", "karşılıklı", "hang out", "takılmak", "forefather", "ata", "grab", "yakalamak", "at last", "nihayet", "booger", "sümük", "diaper", "bebek bezi", "jeopardize", "riske atmak", "hitchhiker", "otostopçu", "to assume", "varsaymak", "hell", "cehennem", "commitment", "bağlılık", "dumped", "terk edilmiş", "dude", "kanka", "twin", "ikiz", "terrific", "müthiş", "indefinable", "tarifsiz", "horrible", "korkunç", "tears", "göz yaşı", "bleed", "kanama", "misfortune", "talihsizlik", "embarrassed", "utanmış", "awkward", "tuhaf", "fiancé", "nişanlı", "behold", "seyretmek", "ablution", "abdest", "abhor", "iğrenmek", "broad-minded", "açık fikirli", "hanger", "askı", "outspoken", "açık sözlü", "calamity", "afet", "dirge", "ağıt", "pincushion", "iğne yastığı", "thread", "iplik", "needle", "iğne", "sewing", "dikiş", "porter", "hamal", "doorman", "kapıcı", "chambermaid", "oda hizmetçisi", "stove", "ocak", "favor", "iyilik", "I lost my temper", "sinirlerim bozuldu", "Eid", "bayram", "help yourself", "buyrun", "proud", "gurur duymak", "in my opinion", "bana göre", "speechless", "suskun", "I am speechless", "nutkum tutuldu", "it is on me", "benden olsun", "keep your nose clean", "pis işlere bulaşma", "enjoy your meal", "afiyet olsun", "as for me", "bence", "rest", "dinlenme", "keep doing", "yapmaya devam et", "keep going", "ilerlemeye devam et", "let me guess", "dur tahmin edeyim", "let it be", "varsın olsun", "never mind", "unut gitsin",
                    //!400
                    "bike", "bisiklet", "I can't take it anymore", "artık dayanamıyorum", "I wish", "keşke", "come off it", "vazgeç", "you reckon", "sen öyle san", "one more time", "bir kez daha", "no one", "kimse", "slave", "köle", "give up", "pes etmek", "never again", "bir daha asla", "out of the blue", "aniden", "gasping", "nefes nefese", "breathless", "nefes nefese", "master", "usta", "pirate", "korsan", "by any chance", "bir ihtimal", "disguise", "kılık değiştirmek", "goofy", "aptal", "so clearly", "belli ki", "sword", "kılıç", "willing", "gönüllü", "faith", "inanç", "pretty", "tatlı","drunk", "sarhoş", "scary", "korkutucu", "shake", "titremek", "trick", "kandırmak", "desperate", "çaresiz", "sink", "lavabo", "mates", "eş", "toss", "fırlatmak", "plenty", "bolca", "canny", "kurnaz", "it's uncanny", "inanılır gibi değil", "likely", "büyük ihtimalle", "trap", "tuzak", "skeptical", "şüpheci", "mysterious", "gizemli", "stuff", "eşya", "rusty", "paslı", "handle it", "halletmek", "definitely", "kesinlikle", "shrew", "şirret", "dare", "cesaret etmek", "how dare she", "bu ne cürret", "done", "tamamlandı", "delivery", "teslimat", "flip a coin", "yazı tura atmak", "stabbed", "bıçaklanmış", "impression", "izlenim", "scissors", "makas", "how much", "ne kadar", "shelter", "barınak", "unpaid", "ücretsiz", "mortal", "ölümlü", "sprain", "burkulma", "impressive", "etkileyici", "whoever", "kim olursa", "blend", "karışım", "throw up", "kusmak", "over and over", "tekrar tekrar", "villain", "kötü adam", "hint", "ipucu", "vulnerable", "savunmasız", "mad", "deli", "take a week off", "bir hafta ara ver", "exposed", "maruz", "get up", "kalk", "evac", "tahliye", "bid", "teklif", "currently", "şu anda", "initializing", "başlatılıyor", "below", "aşağıda", "vulnerability", "korunmasız", "exploit", "sömürmek", "request", "istek", "router", "modem", "inject", "aşılama", "permanently", "kalıcı olarak", "scammer", "dolandırıcı", "buddy", "ahbab", "bright side", "iyi taraf", "doubt", "şüphe", "fault", "arıza", "for a while", "bir süre için", "pull", "çekmek", "plug", "fiş", "restrain", "tutuklama", "imprison", "hapsetmek", "classified", "gizli bilgi", "quick", "hızlı", "brutish", "vahşi", "pay attention", "kulak vermek", "attitude", "tavır", "loop", "döngü", "debug", "hata ayıklama", "plugin", "eklenti", "refresh", "yenilemek", "mute", "sessize almak", "unmute", "sesi açmak",
                    //1500
                    "constuctor", "yapıcı", "overloading", "aşırı yükleme", "junk", "önemsiz", "remote", "uzak", "database", "veri tabanı", "customize", "özelleştirme", "declare", "ilan", "brace", "parantez", "enclosed", "kapalı", "invalid", "geçersiz", "token", "işaret", "threat", "tehdit", "define", "tanımlamak", "undef", "tanımsız", "attract", "cazibe", "attractive", "çekici", "autumn", "son bahar", "away", "uzak", "awful", "berbat", "go bad", "çürümek", "bad tempered", "huysuz", "bake", "pişirmek", "because of", "yüzünden", "behave", "davranmak", "beneath", "altında", "beyond", "ötesinde"

            };
            for(int i=0;i<dizi.length;i++){

                if(dizi[i].equals("condition")){
                    System.out.println(i/2);
                }
            }

            for (int i = 0; i < anadizi.length; i++) {//atma işlemi yapılır.
                anadizi[i][0] = dizi[b];
                anadizi[i][1] = dizi[b + 1];
                anadizi[i][2] = "0";
                b += 2;
            }
            imageView=findViewById(R.id.imageView);
            imageView2=findViewById(R.id.imageView2);
            imageView3=findViewById(R.id.imageView3);
            imageView4=findViewById(R.id.imageView4);
            imageView5=findViewById(R.id.imageView5);
            seviye2 = findViewById(R.id.button);
            seviye3 = findViewById(R.id.button2);
            seviye4 = findViewById(R.id.button3);
            textView2 = findViewById(R.id.textView2);
            textView = findViewById(R.id.textView);
            editText = findViewById(R.id.editText);
            onayla = findViewById(R.id.onayla);
            ilerle = findViewById(R.id.ilerle);
            sorkel=findViewById(R.id.sorkel);
            textView5=findViewById(R.id.textView5);
            textView4=findViewById(R.id.textView4);
            ezberle = findViewById(R.id.ezberle);
            seviye1 = findViewById(R.id.seviye1);
            scroll = findViewById(R.id.scrool);
            textView3 = findViewById(R.id.textView3);
            ezkel = findViewById(R.id.ezkel);
            geri = findViewById(R.id.geri);
            geri1 = findViewById(R.id.geri1);
            textView.setVisibility(View.INVISIBLE);
            editText.setVisibility(View.INVISIBLE);
            onayla.setVisibility(View.INVISIBLE);
            sorkel.setVisibility(View.INVISIBLE);
            ilerle.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            scroll.setVisibility(View.INVISIBLE);
            ezkel.setVisibility(View.INVISIBLE);
            geri.setVisibility(View.INVISIBLE);
            geri1.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView4.setText("Skor: "+sayac);
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
        }
        j1 = sharedPreferences.getInt("armutj1", 0);
        j2 = sharedPreferences.getInt("armutj2", 0);
        j3 = sharedPreferences.getInt("armutj3", 0);
        j4 = sharedPreferences.getInt("armutj4", 0);
        int v = 0;
try {
    for (int i = 0; i < anadizi.length; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.
        anadizitutucu[v] = anadizi[i][0];
        anadizitutucu[v + 1] = anadizi[i][1];
        anadizitutucu[v + 2] = anadizi[i][2];
        v += 3;
    }

    String birlesim = TextUtils.join(",", anadizitutucu); // Dizi elemanları birleştiriliyor.

    birlesim = sharedPreferences.getString("armut", birlesim);

    String[] ayrilma = birlesim.split(",");
    int lv = 0;
    for (int i = 0; i < anadizi.length; i++) {
        anadizi[i][0] = ayrilma[lv];
        anadizi[i][1] = ayrilma[lv + 1];
        anadizi[i][2] = ayrilma[lv + 2];
        lv += 3;
    }
} catch(Exception e){

}




        if (j1 != 0) {
            int vz = 0;
            for (int i = 0; i < j1; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.
                sev1dizitutucu[vz] = dizis1[i][0];
                sev1dizitutucu[vz + 1] = dizis1[i][1];
                sev1dizitutucu[vz + 2] = dizis1[i][2];
                v += 3;
            }
            String birlesims1 = TextUtils.join(",", sev1dizitutucu); // Dizi elemanları birleştiriliyor.
            birlesims1 = sharedPreferences.getString("armut1", birlesims1);
            String[] ayrilmas1 = birlesims1.split(",");
            int lvz = 0;
            for (int i = 0; i < j1; i++) {
                dizis1[i][0] = ayrilmas1[lvz];
                dizis1[i][1] = ayrilmas1[lvz + 1];
                dizis1[i][2] = ayrilmas1[lvz + 2];
                lvz += 3;
            }
        }
        if (j2 != 0) {
            int vz = 0;
            for (int i = 0; i < j2; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.
                sev2dizitutucu[vz] = dizis2[i][0];
                sev2dizitutucu[vz + 1] = dizis2[i][1];
                sev2dizitutucu[vz + 2] = dizis2[i][2];
                v += 3;
            }
            String birlesims2 = TextUtils.join(",", sev2dizitutucu); // Dizi elemanları birleştiriliyor.
            birlesims2 = sharedPreferences.getString("armut2", birlesims2);
            String[] ayrilmas2 = birlesims2.split(",");
            int lvz = 0;
            for (int i = 0; i < j2; i++) {
                dizis2[i][0] = ayrilmas2[lvz];
                dizis2[i][1] = ayrilmas2[lvz + 1];
                dizis2[i][2] = ayrilmas2[lvz + 2];
                lvz += 3;
            }
        }
        if (j3 != 0) {
            int vz = 0;
            for (int i = 0; i < j3; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.
                sev3dizitutucu[vz] = dizis3[i][0];
                sev3dizitutucu[vz + 1] = dizis3[i][1];
                sev3dizitutucu[vz + 2] = dizis3[i][2];
                v += 3;
            }
            String birlesims3 = TextUtils.join(",", sev3dizitutucu); // Dizi elemanları birleştiriliyor.
            birlesims3 = sharedPreferences.getString("armut3", birlesims3);
            String[] ayrilmas3 = birlesims3.split(",");
            int lvz = 0;
            for (int i = 0; i < j3; i++) {
                dizis3[i][0] = ayrilmas3[lvz];
                dizis3[i][1] = ayrilmas3[lvz + 1];
                dizis3[i][2] = ayrilmas3[lvz + 2];
                lvz += 3;
            }
        }
        if (j4 != 0) {
            int vz = 0;
            for (int i = 0; i < j4; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.
                sev4dizitutucu[vz] = dizis4[i][0];
                sev4dizitutucu[vz + 1] = dizis4[i][1];
                sev4dizitutucu[vz + 2] = dizis4[i][2];
                v += 3;
            }
            String birlesims4 = TextUtils.join(",", sev4dizitutucu); // Dizi elemanları birleştiriliyor.
            birlesims4 = sharedPreferences.getString("armut4", birlesims4);
            String[] ayrilmas4 = birlesims4.split(",");
            int lvz = 0;
            for (int i = 0; i < j4; i++) {
                dizis4[i][0] = ayrilmas4[lvz];
                dizis4[i][1] = ayrilmas4[lvz + 1];
                dizis4[i][2] = ayrilmas4[lvz + 2];
                lvz += 3;
            }
        }
        r = random.nextInt(100);
        for (int i = 0; i < 10; i++) {
            kopya[i] = "00";
        }
        int anarti=0;//dizilerin dolu olan eleman sayıları
        for(int i=0;i< anadizi.length;i++){
            if(!anadizi[i][0].equals("00")){
                anarti++;
            }
        }
        int s1arti=0;
        for(int i=0;i<j1;i++){
            if(!dizis1[i][0].equals("00")){
                s1arti++;
            }
        }
        int s2arti=0;
        for(int i=0;i<j2;i++){
            if(!dizis2[i][0].equals("00")){
                s2arti++;
            }
        }
        int s3arti=0;
        for(int i=0;i<j3;i++){
            if(!dizis3[i][0].equals("00")){
                s3arti++;
            }
        }
        if(anarti<20&&s1arti<20&&s2arti<20&&s3arti<20&&j4>500){

        }


    }

    public void sdiziyenile() {
        int rdizi[] = new int[10];
        if (seviye == 0) {
            for (int i = 0; i < sdizi.length; i++) {
                r = random.nextInt(anadizi.length);
                if (icerirmi(rdizi, r) || anadizi[r][0].equals("00")) {
                    i--;
                } else {
                    rdizi[i] = r;
                    sdizi[i][0] = anadizi[r][0];
                    sdizi[i][1] = anadizi[r][1];
                }


            }
        }
        if (seviye == 1) {
            for (int i = 0; i < sdizi.length; i++) {
                r = random.nextInt(j1);
                if (icerirmi(rdizi, r) || dizis1[r][0].equals("00")) {
                    i--;
                } else {
                    rdizi[i] = r;
                    sdizi[i][0] = dizis1[r][0];
                    sdizi[i][1] = dizis1[r][1];
                }


            }
        }


        if (seviye == 2) {
            for (int i = 0; i < sdizi.length; i++) {
                r = random.nextInt(j2);
                if (icerirmi(rdizi, r) || dizis2[r][0].equals("00")) {
                    i--;
                } else {
                    rdizi[i] = r;
                    sdizi[i][0] = dizis2[r][0];
                    sdizi[i][1] = dizis2[r][1];
                }


            }
        }

        if (seviye == 3) {
            for (int i = 0; i < sdizi.length; i++) {
                r = random.nextInt(j3);
                if (icerirmi(rdizi, r) || dizis3[r][0].equals("00")) {
                    i--;
                } else {
                    rdizi[i] = r;
                    sdizi[i][0] = dizis3[r][0];
                    sdizi[i][1] = dizis3[r][1];
                }


            }
        }
        verisakla();
    }

    public boolean icerirmi(int dizi[], int r) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == r) {
                return true;
            }
        }
        return false;
    }

    public void seviyeatla(String a) {


        if (seviye == 0) {
            for (int i = 0; i < anadizi.length; i++) {
                String c = anadizi[i][0].toString();
                if (a.equals(c)) {
                    //kelimeyi üst diziye atadık.
                    dizis1[j1][0] = anadizi[i][0];
                    dizis1[j1][1] = anadizi[i][1];
                    dizis1[j1][2] = "0";
                    j1++;

                    //kelimeyi alt diziden sildik.
                    anadizi[i][0] = "00";
                    anadizi[i][1] = "00";
                    anadizi[i][2] = "00";
                    break;
                }
            }
        }

        if (seviye == 1) {
            for (int i = 0; i < j1; i++) {
                String c = dizis1[i][0].toString();
                if (a.equals(c)) {

                    //kelimeyi üst diziye atadık.
                    dizis2[j2][0] = dizis1[i][0];
                    dizis2[j2][1] = dizis1[i][1];
                    dizis2[j2][2] = "0";
                    j2++;
                    //kelimeyi alt diziden sildik.
                    dizis1[i][0] = "00";
                    dizis1[i][1] = "00";
                    dizis1[i][2] = "00";

                    break;


                }
            }


        }

        if (seviye == 2) {
            for (int i = 0; i < j2; i++) {
                String c = dizis2[i][0].toString();
                if (a.equals(c)) {
                    //kelimeyi üst diziye atadık.
                    dizis3[j3][0] = dizis2[i][0];
                    dizis3[j3][1] = dizis2[i][1];
                    dizis3[j3][2] = "0";
                    j3++;
                    //kelimeyi alt diziden sildik.
                    dizis2[i][0] = "00";
                    dizis2[i][1] = "00";
                    dizis2[i][2] = "00";
                    break;

                }
            }
        }

        if (seviye == 3) {
            for (int i = 0; i < j3; i++) {
                String c = dizis3[i][0].toString();
                if (a.equals(c)) {
                    //kelimeyi üst diziye atadık.
                    dizis4[j4][0] = dizis3[i][0];
                    dizis4[j4][1] = dizis3[i][1];
                    dizis4[j4][2] = "0";
                    j4++;
                    //kelimeyi alt diziden sildik.
                    dizis3[i][0] = "00";
                    dizis3[i][1] = "00";
                    dizis3[i][2] = "00";
                    break;

                }
            }
        }


    }
    public void verisakla() {//kelime dizileri,j1 ler
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int v = 0;
        for (int i = 0; i < anadizi.length; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.

            anadizitutucu[v] = anadizi[i][0];
            anadizitutucu[v + 1] = anadizi[i][1];
            anadizitutucu[v + 2] = anadizi[i][2];
            v += 3;
        }
        v = 0;
        String birlesim = TextUtils.join(",", anadizitutucu); // Dizi elemanları birleştiriliyor.
        editor.putString("armut", birlesim);
        if (j1 != 0) {
            for (int i = 0; i < j1; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.

                sev1dizitutucu[v] = dizis1[i][0];
                sev1dizitutucu[v + 1] = dizis1[i][1];
                sev1dizitutucu[v + 2] = dizis1[i][2];
                v += 3;
            }
            v = 0;

            String birlesims1 = TextUtils.join(",", sev1dizitutucu); // Dizi elemanları birleştiriliyor.
            editor.putString("armut1", birlesims1);
        }
        if (j2 != 0) {
            for (int i = 0; i < j2; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.

                sev2dizitutucu[v] = dizis2[i][0];
                sev2dizitutucu[v + 1] = dizis2[i][1];
                sev2dizitutucu[v + 2] = dizis2[i][2];
                v += 3;
            }
            v = 0;
            String birlesims2 = TextUtils.join(",", sev2dizitutucu); // Dizi elemanları birleştiriliyor.
            editor.putString("armut2", birlesims2);
        }

        if (j3 != 0) {
            for (int i = 0; i < j3; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.

                sev3dizitutucu[v] = dizis3[i][0];
                sev3dizitutucu[v + 1] = dizis3[i][1];
                sev3dizitutucu[v + 2] = dizis3[i][2];
                v += 3;
            }
            v = 0;
            String birlesims3 = TextUtils.join(",", sev3dizitutucu); // Dizi elemanları birleştiriliyor.
            editor.putString("armut3", birlesims3);
        }

        if (j4 != 0) {
            for (int i = 0; i < j4; i++) {//diziyi kaydedebilmek için tek boyutlu bir diziye atıyorum.

                sev4dizitutucu[v] = dizis4[i][0];
                sev4dizitutucu[v + 1] = dizis4[i][1];
                sev4dizitutucu[v + 2] = dizis4[i][2];
                v += 3;
            }
            v = 0;
            String birlesims4 = TextUtils.join(",", sev4dizitutucu); // Dizi elemanları birleştiriliyor.
            editor.putString("armut4", birlesims4);
        }


        editor.putInt("armutj1", j1);
        editor.putInt("armutj2", j2);
        editor.putInt("armutj3", j3);
        editor.putInt("armutj4", j4);
        editor.apply();

    }
    public void altseviyekontrol(String a) {
        if (seviye == 0) {
            for (int i = 0; i < anadizi.length; i++) {
                String k = anadizi[i][0].toString();
                if (a.equals(k)) {//eğer alınan değer anadizide varsa
                    String c = anadizi[i][2].toString();
                    if (c.equals("1")) {//eğer kelimenin alt seviyesi 2 ise
                        seviyeatla(anadizi[i][0]);
                        break;
                    }
                }
            }
        }


        if (seviye == 1) {
            for (int i = 0; i < j1; i++) {
                String k = dizis1[i][0].toString();
                if (a.equals(k)) {//eğer alınan değer anadizide varsa
                    String c = dizis1[i][2].toString();
                    if (c.equals("2")) {//eğer kelimenin alt seviyesi 2 ise
                        seviyeatla(dizis1[i][0]);
                        break;
                    }
                }
            }
        }
        if (seviye == 2) {
            for (int i = 0; i < j2; i++) {
                String k = dizis2[i][0].toString();
                if (a.equals(k)) {//eğer alınan değer anadizide varsa
                    String c = dizis2[i][2].toString();
                    if (c.equals("3")) {//eğer kelimenin alt seviyesi 2 ise
                        seviyeatla(dizis2[i][0]);
                        break;
                    }
                }
            }
        }
        if (seviye == 3) {
            for (int i = 0; i < j3; i++) {
                String k = dizis3[i][0].toString();
                if (a.equals(k)) {//eğer alınan değer anadizide varsa
                    String c = dizis3[i][2].toString();
                    if (c.equals("5")) {//eğer kelimenin alt seviyesi 2 ise
                        seviyeatla(dizis3[i][0]);
                        break;
                    }
                }
            }
        }
    }

    public void altseviyealtla() {//verilen stringe göre hangi kelimelerin seviyesinin atlatılacağını belirler
        if (seviye == 0) {
            for (int i = 0; i < sdizi.length; i++) {
                for (int j = 0; j < anadizi.length; j++) {
                    String a = sdizi[i][0].toString();
                    String b = anadizi[j][0].toString();
                    if (a.equals(b)) {//eğer anadizide alt seviyesi arttırılacak kelime varsa
                        int c = Integer.parseInt(anadizi[j][2]);
                        c++;
                        anadizi[j][2] = Integer.toString(c);
                        altseviyekontrol(anadizi[j][0]);//kontrol de alt seviyesi tespit edilebilsin diye başı gönderilir.
                        break;
                    }
                }
            }
        }
        if (seviye == 1) {
            for (int i = 0; i < sdizi.length; i++) {
                for (int j = 0; j < j1; j++) {
                    String a = sdizi[i][0].toString();
                    String b = dizis1[j][0].toString();
                    if (a.equals(b)) {//eğer anadizide alt seviyesi arttırılacak kelime varsa
                        int c = Integer.parseInt(dizis1[j][2]);
                        c++;
                        dizis1[j][2] = Integer.toString(c);
                        altseviyekontrol(dizis1[j][0]);//kontrol de alt seviyesi tespit edilebilsin diye başı gönderilir.
                        break;
                    }
                }
            }
        }
        if (seviye == 2) {
            for (int i = 0; i < sdizi.length; i++) {
                for (int j = 0; j < j2; j++) {
                    String a = sdizi[i][0].toString();
                    String b = dizis2[j][0].toString();
                    if (a.equals(b)) {//eğer anadizide alt seviyesi arttırılacak kelime varsa
                        int c = Integer.parseInt(dizis2[j][2]);
                        c++;
                        dizis2[j][2] = Integer.toString(c);
                        altseviyekontrol(dizis2[j][0]);//kontrol de alt seviyesi tespit edilebilsin diye başı gönderilir.
                        break;
                    }
                }
            }
        }
        if (seviye == 3) {
            for (int i = 0; i < sdizi.length; i++) {
                for (int j = 0; j < j3; j++) {
                    String a = sdizi[i][0].toString();
                    String b = dizis3[j][0].toString();
                    if (a.equals(b)) {//eğer anadizide alt seviyesi arttırılacak kelime varsa
                        int c = Integer.parseInt(dizis3[j][2]);
                        c++;
                        dizis3[j][2] = Integer.toString(c);
                        altseviyekontrol(dizis3[j][0]);//kontrol de alt seviyesi tespit edilebilsin diye başı gönderilir.
                        break;
                    }
                }
            }
        }
    }

    public Boolean bildimi() {//BİTTİ
        String a = textView.getText().toString();
        if (seviye == 0) {
            for (int i = 0; i < anadizi.length; i++) {
                String b = anadizi[i][0].toString();
                if (a.equals(b)) {
                    String c = editText.getText().toString().trim().toLowerCase().replaceAll("\\s", "");
                    String d = anadizi[i][1].toString().replaceAll("\\s", "");
                    if (c.equals(d)) {
                        textView2.setText("Tebrikler");
                        return true;
                    } else {
                        textView2.setText("Yanlış Cevap--> " + anadizi[i][1]);
                    }
                }
            }
        }
        if (seviye == 1) {
            for (int i = 0; i < j1; i++) {
                String b = dizis1[i][0].toString();
                if (a.equals(b)) {
                    String c = editText.getText().toString().trim().toLowerCase().replaceAll("\\s", "");
                    String d = dizis1[i][1].toString().replaceAll("\\s", "");
                    if (c.equals(d)) {
                        textView2.setText("Tebrikler");
                        return true;
                    } else {
                        deneme++;
                        if(deneme==1){
                            imageView5.setVisibility(View.INVISIBLE);
                        }
                        if(deneme==2){
                            imageView4.setVisibility(View.INVISIBLE);
                        }
                        if(deneme==3){
                            imageView3.setVisibility(View.INVISIBLE);
                        }
                        if(deneme==4){
                            imageView2.setVisibility(View.INVISIBLE);
                        }
                        if (deneme == 5) {//5 defa hata alınırsa sorulan dizideki elemanların alt seviyeleri 1 er düşürülür.
                            altseviyedusur(sdizi);
                            textView2.setText("Yanlış Cevap--> " + dizis1[i][1]+"\nBaşarısız oldunuz :(");
                            sdiziyenile();
                            deneme = 0;
                            imageView.setVisibility(View.INVISIBLE);
                            ilerle.setText("Başla");
                        }
                        else {
                            textView2.setText("Yanlış Cevap--> " + dizis1[i][1]);
                        }
                    }

                }
            }
        }

        if (seviye == 2) {
            for (int i = 0; i < j2; i++) {
                String b = dizis2[i][0].toString();
                if (a.equals(b)) {
                    String c = editText.getText().toString().trim().toLowerCase().replaceAll("\\s", "");
                    String d = dizis2[i][1].toString().replaceAll("\\s", "");
                    if (c.equals(d)) {
                        textView2.setText("Tebrikler");
                        return true;
                    } else {
                        deneme++;
                        if(deneme==1){
                            imageView3.setVisibility(View.INVISIBLE);
                        }
                        if(deneme==2){
                            imageView2.setVisibility(View.INVISIBLE);
                        }
                        if (deneme == 3) {//3 defa hata alınırsa sorulan dizideki elemanların alt seviyeleri 1 er düşürülür.
                            altseviyedusur(sdizi);
                            textView2.setText("Yanlış Cevap--> " + dizis2[i][1]+"\nBaşarısız oldunuz :(");
                            sdiziyenile();
                            deneme = 0;
                            imageView.setVisibility(View.INVISIBLE);
                            ilerle.setText("Başla");

                        }
                        else {
                            textView2.setText("Yanlış Cevap--> " + dizis2[i][1]);
                        }
                    }
                }
            }
        }

        if (seviye == 3) {
            for (int i = 0; i < j3; i++) {
                String b = dizis3[i][0].toString();
                if (a.equals(b)) {
                    String c = editText.getText().toString().trim().toLowerCase().replaceAll("\\s", "");
                    String d = dizis3[i][1].toString().replaceAll("\\s", "");
                    if (c.equals(d)) {
                        textView2.setText("Tebrikler");
                        return true;
                    } else {
                        deneme++;
                        if (deneme == 1) {//1 defa hata alınırsa sorulan dizideki elemanların alt seviyeleri 1 er düşürülür.
                            altseviyedusur(sdizi);
                            textView2.setText("Yanlış Cevap--> " + dizis3[i][1]+"\nBaşarısız oldunuz :(");
                            sdiziyenile();
                            deneme = 0;
                            imageView.setVisibility(View.INVISIBLE);
                            ilerle.setText("Başla");

                        }
                        else {
                            textView2.setText("Yanlış Cevap--> " + dizis3[i][1]);
                        }
                    }
                }
            }
        }

        if (seviye == 4) {
            for (int i = 0; i < j4; i++) {
                String b = dizis4[i][0].toString();
                if (a.equals(b)) {
                    String c = editText.getText().toString().trim().replaceAll("\\s", "");
                    String d = dizis4[i][1].toString().replaceAll("\\s", "");
                    if (c.equals(d)) {
                        textView2.setText("Tebrikler");
                        s4asatla();
                        return true;
                    } else {
                        textView2.setText("Yanlış Cevap--> " + dizis4[i][1]);
                    }
                }
            }
        }
        return false;
    }
    public void s4asatla(){//seviye 4 alt seviye atla

        String a=textView.getText().toString();
        for(int i=0;i<j4;i++){
            String b=dizis4[i][0];
            if(a.equals(b)){
                if(dizis4[i][2].equals("10")){
                    break;
                }else {
                    int c = Integer.parseInt(dizis4[i][2]);
                    c++;
                    dizis4[i][2]=Integer.toString(c);
                }
            }
        }

    }

    public void onayla(View view) {
        onayla.setVisibility(View.INVISIBLE);
        ilerle.setVisibility(View.VISIBLE);

        if (bildimi()) {
            kopya[j] = textView.getText().toString();//yenile de yeni üretilecek kelimenin kopya dizisinde olup olmadığı kontrol edilecek
            j++;
            sayac++;
        } else {
            for (int i = 0; i < 10; i++) {
                kopya[i] = "00";
            }
            sayac = 0;
            j = 0;
        }
        if (sayac == 10) {//yeni gruba geçilir
            textView.setText("");
            ilerle.setText("Başla");
            editText.setVisibility(View.INVISIBLE);
            deneme=0;
            for (int i = 0; i < 10; i++) {
                kopya[i] = "00";
            }

            textView2.setText("Tebrikler bir sonraki seviyeye geçtiniz");
            altseviyealtla();

            editText.setText("");
            j = 0;
            sayac = 0;
            sdiziyenile();
            if (seviye == 1) {
                int a = 0;
                for (int i = 0; i < j1; i++) {
                    if (!dizis1[i][0].equals("00")) {
                        a++;
                    }
                }
                if (a <= 20) {
                    Toast.makeText(MainActivity.this, "En az 20 adet 1. seviye kelimeniz olmalıdır.", Toast.LENGTH_LONG).show();
                    textView.setVisibility(View.INVISIBLE);
                    editText.setVisibility(View.INVISIBLE);
                    scroll.setVisibility(View.INVISIBLE);
                    ezkel.setVisibility(View.INVISIBLE);
                    geri.setVisibility(View.INVISIBLE);
                    geri1.setVisibility(View.INVISIBLE);
                    ezberle.setVisibility(View.VISIBLE);
                    seviye1.setVisibility(View.VISIBLE);
                    seviye2.setVisibility(View.VISIBLE);
                    seviye3.setVisibility(View.VISIBLE);
                    seviye4.setVisibility(View.VISIBLE);
                    onayla.setVisibility(View.INVISIBLE);
                    ilerle.setVisibility(View.INVISIBLE);
                    sorkel.setVisibility(View.INVISIBLE);
                    textView4.setVisibility(View.INVISIBLE);

                }

            }
            if (seviye == 2) {
                int a = 0;
                for (int i = 0; i < j2; i++) {
                    if (!dizis2[i][0].equals("00")) {
                        a++;
                    }
                }
                if (a <=20) {
                    Toast.makeText(MainActivity.this, "En az 20 adet 2. seviye kelimeniz olmalıdır.", Toast.LENGTH_LONG).show();
                    textView.setVisibility(View.INVISIBLE);
                    editText.setVisibility(View.INVISIBLE);
                    scroll.setVisibility(View.INVISIBLE);
                    ezkel.setVisibility(View.INVISIBLE);
                    geri.setVisibility(View.INVISIBLE);
                    geri1.setVisibility(View.INVISIBLE);
                    ezberle.setVisibility(View.VISIBLE);
                    seviye1.setVisibility(View.VISIBLE);
                    seviye2.setVisibility(View.VISIBLE);
                    seviye3.setVisibility(View.VISIBLE);
                    seviye4.setVisibility(View.VISIBLE);
                    onayla.setVisibility(View.INVISIBLE);
                    ilerle.setVisibility(View.INVISIBLE);
                    sorkel.setVisibility(View.INVISIBLE);
                    textView4.setVisibility(View.INVISIBLE);

                }
            }
            if (seviye == 3) {
                int a = 0;
                for (int i = 0; i < j3; i++) {
                    if (!dizis3[i][0].equals("00")) {
                        a++;
                    }
                }
                if (a <= 20) {
                    Toast.makeText(MainActivity.this, "En az 20 adet 3. seviye kelimeniz olmalıdır.", Toast.LENGTH_LONG).show();
                    textView.setVisibility(View.INVISIBLE);
                    editText.setVisibility(View.INVISIBLE);
                    scroll.setVisibility(View.INVISIBLE);
                    ezkel.setVisibility(View.INVISIBLE);
                    geri.setVisibility(View.INVISIBLE);
                    geri1.setVisibility(View.INVISIBLE);
                    ezberle.setVisibility(View.VISIBLE);
                    seviye1.setVisibility(View.VISIBLE);
                    seviye2.setVisibility(View.VISIBLE);
                    seviye3.setVisibility(View.VISIBLE);
                    seviye4.setVisibility(View.VISIBLE);
                    onayla.setVisibility(View.INVISIBLE);
                    ilerle.setVisibility(View.INVISIBLE);
                    sorkel.setVisibility(View.INVISIBLE);
                    textView4.setVisibility(View.INVISIBLE);


                }
            }
            if (seviye == 4) {
                int a = 0;
                for (int i = 0; i < j4; i++) {
                    if (!dizis4[i][0].equals("00")) {
                        a++;
                    }
                }
                if (a <= 20) {
                    Toast.makeText(MainActivity.this, "En az 20 adet 4. seviye kelimeniz olmalıdır.", Toast.LENGTH_LONG).show();
                    textView.setVisibility(View.INVISIBLE);
                    editText.setVisibility(View.INVISIBLE);
                    scroll.setVisibility(View.INVISIBLE);
                    ezkel.setVisibility(View.INVISIBLE);
                    geri.setVisibility(View.INVISIBLE);
                    geri1.setVisibility(View.INVISIBLE);
                    ezberle.setVisibility(View.VISIBLE);
                    seviye1.setVisibility(View.VISIBLE);
                    seviye2.setVisibility(View.VISIBLE);
                    seviye3.setVisibility(View.VISIBLE);
                    seviye4.setVisibility(View.VISIBLE);
                    onayla.setVisibility(View.INVISIBLE);
                    ilerle.setVisibility(View.INVISIBLE);
                    sorkel.setVisibility(View.INVISIBLE);
                    textView4.setVisibility(View.INVISIBLE);
                }
            }

        }
        textView4.setText("Skor: "+sayac);

    }

    public void ilerle(View view) {
        if (seviye == 4) {
            if (ilerle.getText().toString() == "Başla") {
                ilerle.setText("İlerle");
                editText.setHint("Cevabınız...");
                editText.setVisibility(View.VISIBLE);
            }
            editText.setText("");
            editText.setHint("Cevabınızı girin...");
            textView2.setText("");
            onayla.setVisibility(View.VISIBLE);

            r=random.nextInt(j4);
            textView.setText(dizis4[r][0]);



        } else {
            r = random.nextInt(10);
            for (int i = 0; i < 10; i++) {
                if (kopya[i].equals(sdizi[r][0])) {
                    r = random.nextInt(10);
                    i = -1;
                }
            }
            textView.setText(sdizi[r][0]);// sorulacak kelime yazılır.

            editText.setText("");
            editText.setHint("Cevabınızı girin...");
            textView2.setText("");
            onayla.setVisibility(View.VISIBLE);
            if (ilerle.getText().toString() == "Başla") {
                ilerle.setText("İlerle");
                editText.setHint("Cevabınız...");
                editText.setVisibility(View.VISIBLE);
                if (seviye == 1) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                    imageView4.setVisibility(View.VISIBLE);
                    imageView5.setVisibility(View.VISIBLE);
                }
                if (seviye == 2) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                }
                if (seviye == 3) {
                    imageView.setVisibility(View.VISIBLE);

                }
            }
            ilerle.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.VISIBLE);
            editText.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.VISIBLE);
        }
    }

    public void seviyebir(View view) {
        int a = 0;
        for (int i = 0; i < j1; i++) {
            if (!dizis1[i][0].equals("00")) {
                a++;
            }
        }
        if (a > 20) {
            seviye = 1;
            editText.setHint("");
            seviye2.setVisibility(View.INVISIBLE);
            seviye3.setVisibility(View.INVISIBLE);
            seviye4.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.VISIBLE);
            editText.setVisibility(View.VISIBLE);
            onayla.setVisibility(View.VISIBLE);
            textView4.setText("Skor: "+sayac);
            ilerle.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.VISIBLE);
            textView2.setText("");
            onayla.setVisibility(View.INVISIBLE);
            sorkel.setVisibility(View.VISIBLE);
            ilerle.setText("Başla");
            textView.setText("");
            ezkel.setVisibility(View.VISIBLE);
            ezberle.setVisibility(View.INVISIBLE);
            seviye1.setVisibility(View.INVISIBLE);
            geri.setVisibility(View.VISIBLE);
            sdiziyenile();//sorulacak olan kelimeleri kullanıcının seçimine göre düzenler.
        } else {
            Toast.makeText(MainActivity.this, "1. seviye kelimelerle çalışabilmeniz için en az 21 adet 1. seviye kelimeniz olması gerekir.\nMevcut kelime sayısı -->"+a, Toast.LENGTH_LONG).show();
        }
    }

    public void seviyeiki(View view) {
        int a = 0;
        for (int i = 0; i < j2; i++) {
            if (!dizis2[i][0].equals("00")) {
                a++;
            }

        }

        if (a > 20) {
            seviye = 2;
            editText.setHint("");
            textView.setVisibility(View.VISIBLE);
            textView4.setText("Skor: "+sayac);

            seviye2.setVisibility(View.INVISIBLE);
            seviye3.setVisibility(View.INVISIBLE);
            seviye4.setVisibility(View.INVISIBLE);
            onayla.setVisibility(View.INVISIBLE);
            sorkel.setVisibility(View.VISIBLE);
            textView.setText("");
            textView2.setVisibility(View.VISIBLE);
            textView2.setText("");
            textView4.setVisibility(View.VISIBLE);


            ilerle.setText("Başla");
            editText.setVisibility(View.VISIBLE);

            ilerle.setVisibility(View.VISIBLE);
            ezkel.setVisibility(View.VISIBLE);
            ezberle.setVisibility(View.INVISIBLE);
            seviye1.setVisibility(View.INVISIBLE);
            geri.setVisibility(View.VISIBLE);
            sdiziyenile();//sorulacak olan kelimeleri kullanıcının seçimine göre düzenler.
        } else {
            Toast.makeText(MainActivity.this, "2. seviye kelimelerle çalışabilmeniz için en az 21 adet 2. seviye kelimeniz olması gerekir.\nMevcut kelime sayısı -->"+a, Toast.LENGTH_LONG).show();
        }
    }

    public void seviyeuc(View view) {
        int a = 0;
        for (int i = 0; i < j3; i++) {
            if (!dizis3[i][0].equals("00")) {
                a++;
            }

        }
        if (a > 20) {
            seviye = 3;
            editText.setHint("");
            textView.setVisibility(View.VISIBLE);
            editText.setVisibility(View.VISIBLE);
            sorkel.setVisibility(View.VISIBLE);
            textView4.setText("Skor: "+sayac);

            onayla.setVisibility(View.INVISIBLE);
            seviye2.setVisibility(View.INVISIBLE);
            textView2.setText("");
            textView4.setVisibility(View.VISIBLE);
            ilerle.setText("Başla");
            textView.setText("");
            seviye3.setVisibility(View.INVISIBLE);
            seviye4.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.VISIBLE);
            ilerle.setVisibility(View.VISIBLE);
            ezkel.setVisibility(View.VISIBLE);
            ezberle.setVisibility(View.INVISIBLE);
            seviye1.setVisibility(View.INVISIBLE);
            geri.setVisibility(View.VISIBLE);
            sdiziyenile();//sorulacak olan kelimeleri kullanıcının seçimine göre düzenler.
        } else {
            Toast.makeText(MainActivity.this, "3. seviye kelimelerle çalışabilmeniz için en az 21 adet 3. seviye kelimeniz olması gerekir.\nMevcyt kelime sayısı -->"+a, Toast.LENGTH_LONG).show();
        }
    }

    public void seviyedort(View view) {
        int a = 0;
        for (int i = 0; i < j4; i++) {
            if (!dizis4[i][0].equals("00")) {
                a++;
            }

        }
        if (a > 20) {
            seviye = 4;
            sorkel.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.VISIBLE);
            editText.setVisibility(View.VISIBLE);
            seviye2.setVisibility(View.INVISIBLE);
            seviye3.setVisibility(View.INVISIBLE);
            ilerle.setText("Başla");
            textView4.setVisibility(View.VISIBLE);

            seviye4.setVisibility(View.INVISIBLE);
            textView2.setText("");
            onayla.setVisibility(View.INVISIBLE);
            editText.setHint("");
            ilerle.setVisibility(View.VISIBLE);
            ezkel.setVisibility(View.VISIBLE);
            ezberle.setVisibility(View.INVISIBLE);
            seviye1.setVisibility(View.INVISIBLE);
            geri.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.VISIBLE);
            textView4.setText("Skor: "+sayac);

            textView.setText("");
            sdiziyenile();//sorulacak olan kelimeleri kullanıcının seçimine göre düzenler.
        } else {
            Toast.makeText(MainActivity.this, "4. seviye kelimelerle çalışabilmeniz için en az 21 aedt 4. seviye kelimeniz olması gerekir.\nMevcut kelime sayısı -->"+a, Toast.LENGTH_LONG).show();
        }
    }

    public void ezberle(View view) {
        seviye = 0;
        editText.setHint("");
        textView.setVisibility(View.INVISIBLE);
        editText.setVisibility(View.INVISIBLE);
        onayla.setVisibility(View.VISIBLE);
        sorkel.setVisibility(View.VISIBLE);
        ilerle.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        seviye2.setVisibility(View.INVISIBLE);
        textView2.setText("");
        seviye3.setVisibility(View.INVISIBLE);
        seviye4.setVisibility(View.INVISIBLE);
        ezberle.setVisibility(View.INVISIBLE);
        seviye1.setVisibility(View.INVISIBLE);
        ezkel.setVisibility(View.VISIBLE);
        geri.setVisibility(View.VISIBLE);
        textView4.setVisibility(View.VISIBLE);
        sdiziyenile();
        onayla.setVisibility(View.INVISIBLE);
        ilerle.setText("Başla");
        textView.setText("");
        textView4.setText("Skor: "+sayac);
    }
    public void ezkel(View view) {//tıklandığında tüm kelimeleri ekranda gösterir.
        int k0=0,k1=0,k2=0,k3=0,k4=0;
        for(int i=0;i< anadizi.length;i++){
            if(anadizi[i][0].equals("00")){
                continue;
            }
            else{
                k0++;
            }
        }
        for(int i=0;i<j1;i++){
            if(dizis1[i][0].equals("00")){
                continue;
            }
            else{
                k1++;
            }
        }
        for(int i=0;i<j2;i++){
            if(dizis2[i][0].equals("00")){
                continue;
            }
            else{
                k2++;
            }
        }
        for(int i=0;i<j3;i++){
            if(dizis3[i][0].equals("00")){
                continue;
            }
            else{
                k3++;
            }
        }
        for(int i=0;i<j4;i++){
            if(dizis4[i][0].equals("00")){
                continue;
            }
            else{
                k4++;
            }
        }
        if(onayla.getVisibility()==View.INVISIBLE){
            gortut=1;
        }
        else{
            gortut=0;
        }
        if (seviye == 0) {
            String aa=Integer.toString(k0);
            textView5.setText(aa+" Kelime Mevcut");
            String h = "";
            for (int i = 0; i < anadizi.length; i++) {
                String a = anadizi[i][0].toString();
                String b = anadizi[i][1].toString();
                if (a.equals("00")) {
                    continue;
                }
                String k = a + " --> " + b + "\n";
                h = h + k;
            }
            textView3.setText(h);
        }

        if (seviye == 1) {
            String aa=Integer.toString(k1);
            textView5.setText(aa+" Kelime Mevcut");
            String h = "";
            for (int i = 0; i < j1; i++) {
                String a = dizis1[i][0].toString();
                String b = dizis1[i][1].toString();
                String c = dizis1[i][2].toString();
                if (a.equals("00")) {
                    continue;
                }
                String k = a + " --> " + b +"-->"+ c+"\n";
                h = h + k;
            }
            textView3.setText(h);
        }

        if (seviye == 2) {
            String aa=Integer.toString(k2);
            textView5.setText(aa+" Kelime Mevcut");
            String h = "";
            for (int i = 0; i < j2; i++) {
                String a = dizis2[i][0].toString();
                String b = dizis2[i][1].toString();
                String c = dizis2[i][2].toString();
                System.out.println(c);
                if (a.equals("00")) {
                    continue;
                }
                String k = a + " --> " + b +"-->"+ c+"\n";
                h = h + k;
            }
            textView3.setText(h);
        }

        if (seviye == 3) {
            String aa=Integer.toString(k3);
            textView5.setText(aa+" Kelime Mevcut");
            String h = "";
            for (int i = 0; i < j3; i++) {
                String a = dizis3[i][0].toString();
                String b = dizis3[i][1].toString();
                String c = dizis3[i][2].toString();
                if (a.equals("00")) {
                    continue;
                }
                String k = a + " --> " + b +"-->"+ c+"\n";
                h = h + k;
            }
            textView3.setText(h);
        }

        if (seviye == 4) {
            String aa=Integer.toString(k4);
            textView5.setText(aa+" Kelime Mevcut");
            String h = "";
            for (int i = 0; i < j4; i++) {
                String a = dizis4[i][0].toString();
                String b = dizis4[i][1].toString();
                if (a.equals("00")) {
                    continue;
                }
                String k = a + " --> " + b + "\n";
                h = h + k;
            }
            textView3.setText(h);
        }
        scroll.setVisibility(View.VISIBLE);
        textView5.setVisibility(View.VISIBLE);
        sorkel.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        editText.setVisibility(View.INVISIBLE);
        onayla.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        ilerle.setVisibility(View.INVISIBLE);
        ezberle.setVisibility(View.INVISIBLE);
        seviye1.setVisibility(View.INVISIBLE);
        ezkel.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        geri.setVisibility(View.INVISIBLE);
        geri1.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
    }
    public void sorkel(View view){
        if(onayla.getVisibility()==View.INVISIBLE){
            gortut=1;
        }
        else{
            gortut=0;
        }
if(seviye==0) {
    String h = "";
    for (int i = 0; i < sdizi.length; i++) {
        String a = sdizi[i][0].toString();
        String b = sdizi[i][1].toString();
        String k = a + " --> " + b + "\n";
        h = h + k;
    }
    textView3.setText(h);
}
if(seviye==1||seviye==2||seviye==3){
    String h = "";
    for (int i = 0; i < sdizi.length; i++) {
        String a = sdizi[i][0].toString();
        String b = sdizi[i][1].toString();
        String k = a+ "\n";
        h = h + k;
    }
    textView3.setText(h);
}
        sorkel.setVisibility(View.INVISIBLE);
        scroll.setVisibility(View.VISIBLE);
        textView.setVisibility(View.INVISIBLE);
        editText.setVisibility(View.INVISIBLE);
        onayla.setVisibility(View.INVISIBLE);
        ilerle.setVisibility(View.INVISIBLE);
        ezberle.setVisibility(View.INVISIBLE);
        seviye1.setVisibility(View.INVISIBLE);
        ezkel.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        geri.setVisibility(View.INVISIBLE);
        geri1.setVisibility(View.VISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);


    }
    public void geri(View view) {
        sayac=0;
        textView2.setVisibility(View.INVISIBLE);
        ezberle.setVisibility(View.VISIBLE);
        seviye1.setVisibility(View.VISIBLE);
        geri.setVisibility(View.INVISIBLE);
        ezkel.setVisibility(View.INVISIBLE);
        sorkel.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        onayla.setVisibility(View.INVISIBLE);
        ilerle.setVisibility(View.INVISIBLE);
        editText.setVisibility(View.INVISIBLE);
        seviye2.setVisibility(View.VISIBLE);
        seviye3.setVisibility(View.VISIBLE);
        seviye4.setVisibility(View.VISIBLE);
        editText.setText("");
        textView4.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        deneme=0;
    }
    public void geribir(View view) {
        if(gortut==1){
            onayla.setVisibility(View.INVISIBLE);
            ilerle.setVisibility(View.VISIBLE);
        }
        else {
            onayla.setVisibility(View.VISIBLE);
            ilerle.setVisibility(View.INVISIBLE);
        }
        textView5.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.VISIBLE);
        editText.setVisibility(View.VISIBLE);
        textView.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        scroll.setVisibility(View.INVISIBLE);
        ezkel.setVisibility(View.VISIBLE);
        geri1.setVisibility(View.INVISIBLE);
        geri.setVisibility(View.VISIBLE);
        sorkel.setVisibility(View.VISIBLE);
        if(seviye==1){
            if(ilerle.getText().toString()!="Başla") {
                if(deneme==0) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                    imageView4.setVisibility(View.VISIBLE);
                    imageView5.setVisibility(View.VISIBLE);
                }
                if(deneme==1) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                    imageView4.setVisibility(View.VISIBLE);
                }
                if(deneme==2) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                }
                if(deneme==3) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                }
                if(deneme==4) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }
                if(deneme==5) {
                    textView4.setVisibility(View.VISIBLE);
                }
            }
        }
        if(seviye==2){
            if(ilerle.getText().toString()!="Başla") {
                if(deneme==0) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                }
                if(deneme==1) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                }
                if(deneme==2) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }
                if(deneme==3) {
                    textView4.setVisibility(View.VISIBLE);

                }

            }
        }
        if(seviye==3){
            if(ilerle.getText().toString()!="Başla") {
                if(deneme==0) {
                    textView4.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }
                if(deneme==1) {
                    textView4.setVisibility(View.VISIBLE);
                }
            }
        }

    }
    public void altseviyedusur(String dizi[][]) {
        if (seviye == 1) {
            for (int i = 0; i < dizi.length; i++) {
                for (int j = 0; j < dizis1.length; j++) {
                    if (dizi[i][0].equals(dizis1[j][0])) {
                        if (!dizis1[j][2].equals("0")) {
                            int a = Integer.parseInt(dizis1[j][2]);
                            a--;
                            dizis1[j][2] = Integer.toString(a);
                        }
                        break;
                    }
                }
            }
        }

        if (seviye == 2) {
            for (int i = 0; i < dizi.length; i++) {
                for (int j = 0; j < dizis2.length; j++) {
                    if (dizi[i][0].equals(dizis2[j][0])) {
                        if (!dizis2[j][2].equals("0")) {
                            int a = Integer.parseInt(dizis2[j][2]);
                            a--;
                            dizis2[j][2] = Integer.toString(a);
                        }
                        break;
                    }

                }

            }
        }

        if (seviye == 3) {
            for (int i = 0; i < dizi.length; i++) {
                for (int j = 0; j < dizis3.length; j++) {
                    if (dizi[i][0].equals(dizis3[j][0])) {
                        if (!dizis3[j][2].equals("0")) {
                            int a = Integer.parseInt(dizis3[j][2]);
                            a--;
                            dizis3[j][2] = Integer.toString(a);
                        }

                    }
                    break;
                }

            }
        }
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Uygulamadan çıkmak istediğinize emin misiniz?")
                .setCancelable(false)
                .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Uygulamadan çıkma işlemini gerçekleştirin
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Uyarıyı kapatın ve uygulamada kalın
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}