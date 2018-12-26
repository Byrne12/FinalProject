package com.example.ahxre.pokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
implements AdapterView.OnItemSelectedListener {
    List<DataItem> lstData; String grass="草",po="毒";
    String p0 = ("經常可見牠在太陽下睡午覺的樣子。在沐浴了充足的陽光之後，牠背上的種子就會成長茁壯。");
    String p1 = ("下盤為了支撐背上的花苞而變得強韌。當待在太陽底下一動也不動的時間變長，就表示大朵的花即將盛開。");
    String p2 = ("據說充足的營養和陽光會讓花朵的顏色變得更加鮮豔。花朵散發的香氣能夠療癒人心。");
    String p3 = ("尾巴上的火焰代表牠的心情。開心時火焰會搖曳晃動，生氣時火焰則會猛烈燃燒。");
    String p4 = ("會用銳利的爪子無情地打倒對手。遇到強敵時會興奮起來，尾巴上會燃起藍白色的火焰。");
    String p5 = ("會在空中四處飛翔尋找強大的對手。在面對比自己弱小的對手時，牠不會吐出那可熔化一切的高溫火焰。");
    String p6 = ("甲殼的作用不僅是用來保護自己，圓潤的外形和表面的溝槽會減少水的阻力，使牠能夠快速地游泳。");
    String p7 = ("長滿蓬鬆毛髮的大尾巴，顏色會隨著年齡增長而變深。甲殼上的傷痕是強者的證明。");
    String p8 = ("甲殼上的噴射口能夠精確地瞄準目標。射出的水彈可以命中５０公尺外的空罐子。");
    String p9 = ("身體柔軟，又沒什麼力氣。在自然界，牠的命運就是不斷被當成獵物來捕食。");
    String p10= ("外殼非常堅硬，就算被小篤兒啄到也能平安無事，但殼裡的身體會因為晃動而流出來。");
    String p11= ("愛吃美麗花朵的花蜜，總是在花圃和萌虻展開激烈的地盤爭奪戰。");
    String p12= ("有著非常靈敏的嗅覺。能用大大的紅鼻子聞出自己喜歡吃和不喜歡吃的葉子。");
    String p13= ("雖然掛在樹上幾乎一動也不動，但體內正為了進化而忙碌準備著。證據就是牠的身體會變得很熱。");
    String p14= ("大針蜂非常重視自己的地盤，為了安全起見，最好不要接近牠的住處。一旦生氣就會成群結隊襲擊而來。");
    String p15= ("因為方向感非常好，所以無論到了離巢穴多遠的地方，都能不迷路地飛回巢穴。");
    String p16= ("會飛在空中巡視自己廣大的地盤。要是有誰膽敢侵犯牠的地盤，牠會毫不留情地用利爪狠狠教訓一番。");
    String p17= ("有著亮麗羽毛的寶可夢。有許多訓練家被大比鳥頭上美麗的羽毛深深吸引而開始培育牠。");
    String p18= ("雖然是常見的寶可夢，但還是要小心。銳利的門牙十分堅硬，就連木材也能輕易咬斷。");
    String p19= ("鬍鬚是用來保持平衡的重要器官。就算感情再好，如果摸了牠的鬍鬚，牠都會生氣地咬過來。");
    String p20= ("翅膀很短，無法長距離飛行。總是不停地四處跳來跳去，忙著啄食蟲寶可夢。");
    String p21= ("在阿羅拉，牠的獵物是魚寶可夢，所以能看見牠盤旋在海上尋找食物的景象。");
    String p22= ("最愛吃鳥寶可夢的蛋。因為總是不咀嚼就整個吞下，有時會被噎住而昏倒。");
    String p23= ("用腹部的花紋使對手畏縮後，就會迅速地用身體纏緊對手，然後靜待對手心跳停止。");
    String p24= ("會在睡覺時用臉頰上的囊製造電力。如果睡眠不足，就只能放出微弱的電力。");
    String p25= ("許多訓練家比較喜歡皮卡丘的模樣，因而使得這種寶可夢相當少見。");
    String p26= ("當皮膚因為濕氣而發脹變軟時，會前往火山地區，趴在因地熱而帶著高溫的地面上烘乾。");
    String p27= ("擅長用厚實的爪子來爬樹。也有許多穿山王會直接把樹上當成睡覺的地方。");
    String p28= ("人們認為牠是為了保護自己嬌小的身體才演化出了威力強大的毒針。生氣時會從角的尖端噴出劇毒。");
    String p29= ("和夥伴及家人在一起的時候，會收起尖刺以避免傷到彼此。一旦離開夥伴似乎就會變得不安。");
    String p30= ("擅長利用長滿堅硬鱗片的身體將對手撞飛的攻擊。在保護孩子的時候會發揮最強的力量。");
    String p31= ("牽動耳朵的肌肉十分發達，可以隨意將耳朵轉動到任何方向。是無論多小的聲音也不會漏聽的寶可夢。");
    String p32= ("有著比鑽石還要堅硬的角。感覺到敵人的氣息時，背上的刺會一起豎起來全力迎敵。");
    String p33= ("粗壯的尾巴揮出的一擊有著能將堅固鐵塔折斷的驚人破壞力。一旦鬧了起來就無人能擋。");
    String p34= ("沐浴著月光的翅膀會發出淡淡的光輝，不需要振翅就能浮在空中翩翩起舞。");
    String p35= ("也有科學家認為，牠之所以會在滿月的晚上盯著夜空看，是因為牠在想家。");
              String p366=("會操縱火球捕捉獵物。如果從小就開始養育的話，牠就會像小狗寶可夢那樣親近人。");
    String p37= ("會從口中吐出搖曳的火焰，讓獵物陷入催眠狀態後再發動襲擊。是一種非常聰明的寶可夢。");
    String p38= ("隨著棲息的地方不同，所唱的歌也完全不一樣。甚至有一部分胖丁唱的歌聽起來就像是在大吼大叫。");
    String p39= ("生氣時會拼命吸氣，讓自己的身體不斷膨脹。有時甚至能脹大到原來的２０倍。");
    String p40= ("皮膚薄到只要被陽光照射到就會曬傷。當天氣變冷時，會成群靠在一起互相取暖。");
    String p41= ("一次能吸３００毫升的血液。有時會因為吸了太多的血，連飛都飛不起來。");
    String p42= ("會尋找肥沃的土地來把自己埋進去。白天埋在土裡的時候，腳好像會變成像是樹根的形狀。");
    String p43= ("臭臭花好像特別喜歡從嘴裡流出的強烈臭味。聞到那味道時會分泌出更多的花蜜。");
    String p44= ("會用世界上最大的花瓣引誘獵物靠近，然後將毒花粉撒在獵物的身上，並把無法動彈的獵物捉起來吃掉。");
    String p45= ("控制蟲子的是一種叫做冬蟲夏草的蕈類。蟲子的意志會被忽視。");
    String p46= ("有毒的孢子也能用於中藥。但阿羅拉地區生產出來的品質似乎不怎麼樣。");
    String p47= ("據說為了保護自己，變得全身長滿了堅硬細小的體毛。有著不會放過任何小獵物的眼睛。");
    String p48= ("具有夜行性，會在夜間開始活動。喜歡捕食被路燈的燈光吸引而聚集在一起的小蟲子。");
    String p49= ("農民們會在農作物周圍種上地鼠喜歡的樹木，藉此讓牠們來耕作土地。");
    String p50= ("腦袋長得渾圓光滑，但卻極為堅硬。不管是哪種地層都能用頭錘挖掘前進。");
    String p51= ("非常喜歡硬幣，只要給牠硬幣就能輕易和牠親近。但因為牠性情善變，所以這招也不是一定有效。");
    String p52= ("很受有錢人喜愛的寶可夢。有些獵人會為了額頭上的寶石而獵捕牠。");
    String p53= ("據了解，當頭痛發生時，牠的腦細胞活動會比平時活躍１０倍。");
    String p54= ("游泳專家。能靈活地擺動長長的尾巴，連續游上整整２天。");
    String p55= ("只要有１隻發怒，周圍的猴怪也會跟著開始發起怒來，所以猴怪群從沒有一刻是安靜的。");
    String p56= ("和其他的寶可夢比起來，牠的腦血管特別結實，就算一直發怒也能活得好好的。");
    String p57= ("很久以前開始就和人類一起生活。從石器時代的遺跡中出土過牠的骨頭。");
    String p58= ("雖然留下了許多傳說，被人們稱為傳說的寶可夢，但發現到的數量卻意外地多。");
    String p59= ("漩渦的方向隨著地域的不同有著微妙的差異。蚊香蝌蚪的愛好者似乎一眼就能分辨出來。");
    String p60= ("皮膚一旦乾燥就會失去活力，所以要經常幫牠補充水分。");
    String p61= ("靠著游泳鍛鍊出的肌肉非常粗壯結實。牠使出的正拳就連巨大的岩石也能擊碎。");
    String p62= ("會讀對方的心，在危險來臨前使出瞬間移動逃走。要捕捉牠就必須讓自己的心完全放空。");
    String p63= ("擁有強大的精神力。但如果沒有拿著銀湯匙，精神力量就會減半。");
    String p64= ("會把湯匙交給自己打從心裡信任的對象。如果用這種湯匙吃東西，不管是什麼吃起來似乎都會很美味。");
    String p65= ("喜歡營養價值高的食物。之所以如此是受到本能驅使，為的是讓肌肉增長得更有效率。");
    String p66= ("是很受歡迎的雕刻主題。經過千錘百煉的肌肉讓許多藝術家為之著迷。");
    String p67= ("４隻手臂能夠同時兼顧進攻與防守。據說牠精通這世上所有的格鬥技。");
    String p68= ("無論多強的攻擊都能靠著彎曲纖細柔軟的身體來迴避。會從口中吐出連鐵都能融化的液體。");
    String p69= ("到了晚上就會用臀部的鉤子掛在樹枝上睡覺。如果睡相不好，早上就會掉到地上。");
    String p70= ("會讓長在頭上的藤蔓像小生物一樣動來動去引誘獵物。等獵物靠近時就會張開大嘴一口吞掉。");
    String p71= ("身體的９９％是水分。剩下的１％之中包含了用來製造毒素的器官。");
    String p72= ("透過讓紅色珠子發光來與夥伴交流。閃爍的光芒是用來通知警戒狀況的信號。");
    String p73= ("會用雙手攀登險峻的山崖。人們似乎是在目睹牠那姿態之後才開始了抱石攀岩運動。");
    String p74= ("藉著從山崖上滾落來移動。如果不小心掉進河裡，就會在最後掙扎時來個大爆炸。");
    String p75= ("會讓自己的身體爆炸，然後利用爆炸的力量快速登上陡峭的山路。");
    String p76= ("剛出生的時候連站起來也很不容易，但在跌跌撞撞地追趕雙親的過程中，下盤會被鍛鍊得十分結實。");
    String p77= ("雖然平時總是悠閒地在原野上到處跑，但一旦認真起來，鬃毛上的火焰就會燃燒，以２４０公里的時速開始奔馳。");
    String p78= ("自然斷裂後脫落的尾巴是一種容易取得但又十分貴重的食材。");
    String p79= ("為了能夠從尾巴上吸到更多的甘美精華，貪吃的大舌貝把外殼變化成了螺旋狀。");
    String p80= ("可能是因為最近電線都埋在地下的關係，襲擊發電廠的小磁怪變得越來越多了。");
    String p81= ("當天空中出現雨雲時，牠們就會聚集在高處，等待著天上落下雷電。");
    String p82= ("手上拿著的植物莖好像有好有壞，所以大蔥鴨之間有時會為了爭奪莖而彼此爭鬥。");
    String p83= ("２顆頭共用同一個大腦。但研究報告指出有極少數的嘟嘟生來就分別擁有不同的大腦。");
    String p84= ("好像不只是擁有３顆頭，心和肺也有３個，所以就算跑上很長的距離也不會喘不過氣。");
    String p85= ("因為有著厚厚的脂肪，所以完全不怕寒冷的海域，但在溫暖的海裡就有點容易中暑。");
    String p86= ("進食之後會在沙灘上做日光浴，藉此提高體溫來幫助消化。");
    String p87= ("最近工廠排放的廢水太乾淨，使得牠沒東西可吃。據說就快要絕種了。");
    String p88= ("由於牠會散播病原菌，因此不斷遭到驅逐，結果導致牠的數量急遽減少。");
             String p899= ("就算是在緊閉貝殼的時候，舌頭部分也會一直露出來。如果用力拉舌頭，牠就會嚇得把殼打開。");
    String p90= ("最愛吃呆呆獸的尾巴。有時甚至會爬到陸地上來尋找呆呆獸。");
    String p91= ("身體的９５％是由毒氣構成。剩下的５％據說是死於毒氣的死者的靈魂。");
    String p92= ("心情悲傷時在夜晚單獨外出是很危險的。鬼斯通會捉住你，讓你回不了家。");
    String p93= ("即使待在自己家裡也很危險。牠會潛伏在房屋角落僅有的一丁點陰暗處，伺機捕捉獵物。");
    String p94= ("因為腦內有磁石，所以即使在地裡挖洞前進也不會弄錯方向。年紀越大身體就越圓潤。");
    String p95= ("會讓獵物睡著，吃掉對方所做的夢。惡夢的味道是酸的，所以牠似乎不怎麼愛吃。");
    String p96= ("為了幫助那些晚上失眠的人，也有些引夢貘人會到醫院去協助醫生。");
    String p97= ("會在沙灘上挖洞並生活在裡面。在食物稀少的沙灘上，能夠看到大鉗蟹們為了搶地盤而彼此爭鬥。");
    String p98= ("巨鉗蟹之間會透過揮舞巨大的鉗子來傳遞信號，但由於鉗子太重，很快就會累了。");
    String p99= ("稍微受點衝擊就會立刻爆炸。有傳聞說牠是在用強力脈衝照射精靈球時誕生的。");
    String p100= ("擁有被電力吸引的特質。主要聚集在發電廠吃剛產出的電力，是一群令人頭疼的傢伙。");
    String p101= ("即使大小相同，阿羅拉產的蛋蛋會特別重。這是因為牠裡面長得非常紮實。");
    String p102= ("３個頭分別想著不同的事。如果每個頭想去的方向不同，就會在原地無法動彈。");
    String p103= ("頭上戴著母親的骨頭，所以看不見牠的長相和表情，只知道牠一直在哭泣。");
    String p104= ("會節奏性地敲響骨頭，藉此與夥伴進行聯絡。節奏有著將近５０種不同變化。");
    String p105 = ("會用能伸縮自如的腿使出猛烈的腳踢把對手踢倒。戰鬥後會去按摩疲勞的雙腿。");
    String p106 = ("快拳郎身上據說寄宿著以成為世界冠軍為目標的拳擊手的靈魂。不屈不撓的牠永遠不會認輸。");
    String p107 = ("會用舌頭把髒污舔乾淨。舔過的地方會有點臭，是否真的乾淨令人懷疑。");
    String p108 = ("會讓垃圾廚餘和體內的毒素起化學反應來製造劇毒的瓦斯。氣溫越高，製造出的瓦斯就越多。");
    String p109 = ("透過讓雙胞胎的身體輪流收縮膨脹來混合毒瓦斯。越是混合毒性越強，味道也越臭。");
    String p110 = ("腦容量小所以頭腦很差，會跑著跑著就忘了原本的目的。偶爾會在破壞了什麼東西之後想起來。");
    String p111 = ("會用變成鑽頭的角破壞岩石。有時會因此讓熔岩噴發，但牠身上鎧甲般的皮膚不會感覺到熱。");
    String p112 = ("由於曾有過以奪取牠腹部的蛋為目的而加以濫捕的歷史，所以牠的數量非常稀少。");
    String p113 = ("被敵人抓住時藤蔓會斷開。因為完全不會痛，所以牠會趁那個空檔逃走。藤蔓在第二天就會重新長好。");
    String p114 = ("絕對不要靠近從袋獸腹中溜出來玩耍的孩子，因為母親正在某處守護著牠。");
    String p115 = ("一感覺到危險就會反射性地從口中吐出漆黑的墨汁並逃跑。會靈巧地擺動背鰭來游動。");
    String p116 = ("會旋轉身體製造出漩渦，用足以將漁船吞噬的激流削弱獵物的體力，然後一口吞掉。");
    String p117 = ("會輕飄飄地搖擺著像裙子一樣的鰭來游動，所以牠被稱為水中公主。");
    String p118 = ("雄性會在河底跳舞，藉此吸引雌性的目光。雌性會聚集到舞跳得最美的雄性身邊。");
    String p119 = ("不管受多少傷都不怕。由於再生能力很強，只要半天左右就會復原。");
    String p120 = ("會轉動像幾何圖形般的身體在水中游動。似乎一直在發射神秘的電波。");
    String p121 = ("會用默劇製造出看不見的牆壁。如果不讚美牠的話，連環巴掌就會向你襲來。");
    String p122 = ("肉眼無法看清的迅速動作甚至能夠斬斷空氣。被稱為忍者的牠在阿羅拉很受歡迎。");
    String p123 = ("奇異的叫聲聽起來就像是人類的語言。也有些音樂家會創作讓迷唇姐唱的曲子。");
    String p124 = ("人們經常把停電的原因歸咎到牠們身上，但其實大多是電力公司的過失。");
    String p125 = ("待的地方越熱，身體狀況就越好。據說和其他地方比起來，阿羅拉的鴨嘴火獸更加強壯。");
    String p126 = ("雖然很強壯，但弱點是怕冷。到了晚上就會把身體埋在樹葉堆裡睡覺。");
    String p127 = ("會組成群體來生活。群體中角最粗、最長，且傷痕最多的就是老大。");
    String p128 = ("生命力頑強，即使待在污水中也不怕。棲息在世界各地的水邊。");
    String p129 = ("進化能量強烈刺激了腦細胞，結果使得牠的性格變得非常兇暴。");
    String p130 = ("因為受到過度保護而導致數量激增。據說在拉普拉斯過多的海域，魚寶可夢的數量已漸漸減少了。");
    String p131 = ("能變身成自己看過的東西。但當對象不在眼前時，因為只能靠記憶來變身，所以有時會失敗。");
    String p132 = ("有著容易受到周遭影響的基因。就連長相都會變得和成為牠主人的訓練家越來越像。");
    String p133 = ("會用鰭感知周圍的水分。如果牠開始微微顫抖，幾個小時之後就會下雨。");
    String p134 = ("能將豎起來的毛像針一樣發射出去。會趁敵人衰弱的時候用１萬伏特的電擊解決對手。");
    String p135 = ("當牠興奮時，體內的火囊就會著火，體溫會上升到９００度。");
    String p136 = ("在２０年前被夢想著能探索宇宙的科學家們創造出來。這個夢想至今仍未實現。");
    String p137 = ("從古代的化石復原而來。在很久以前曾經是海洋的地方能夠發掘到牠的貝殼化石。");
    String p138 = ("會用觸手纏住獵物，封鎖對手的行動，然後用銳利的牙齒給予致命一擊。");
    String p139 = ("除了極少數的區域之外，這種寶可夢幾乎已經絕種。會用堅硬的外殼保護身體。");
    String p140 = ("能以大約２９節的速度游動。會迅速地接近獵物，然後用鐮刀撕裂對手給予致命一擊。");
    String p141 = ("以高高在上的姿態翱翔在古代的天空中。一旦降落到地面就會變得很弱，連走路也很慢。");
    String p142 = ("就只對吃感興趣。當牠睡午覺時，就算站上牠的肚子，牠也絲毫不會在意。");
    String p143 = ("操縱冰的傳說的鳥寶可夢。因為拍動翅膀就能冷卻空氣，所以據說急凍鳥飛過的地方就會下雪。");
    String p144 = ("操縱電的傳說的鳥寶可夢。平時生活在雷雲之中。被雷電擊中時體內會湧現出力量。");
    String p145 = ("操縱火的傳說的鳥寶可夢。據說受傷時會鑽進火山口的熔岩裡，燃燒全身來治癒身上的傷口。");
    String p146 = ("以接近每天一次的頻率反覆脫皮並長大。剛脫完皮的皮膚很柔軟。");
    String p147 = ("據說如果能在新年時看見牠扭動身子在空中飛翔的樣子，這一年就能過得很健康。");
    String p148 = ("心地善良的寶可夢。經常能聽見牠在海上救了溺水的人或寶可夢的消息。");
    String p149 = ("透過操作基因製造出的寶可夢。人類的科技可以造出牠的身體，卻無法造出一顆溫柔的心。");
    String p150 = ("據說牠有著所有寶可夢的基因。因為可以隨心所欲地隱形，所以就算接近人類也完全不會被察覺。");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData = new ArrayList<>();

        lstData.add(new DataItem(R.drawable.pm001,"#01 妙蛙種子"));
        lstData.add(new DataItem(R.drawable.pm002,"#02 妙蛙草"));
        lstData.add(new DataItem(R.drawable.pm003,"#03 妙蛙花"));
        lstData.add(new DataItem(R.drawable.pm004,"#04 小火龍"));
        lstData.add(new DataItem(R.drawable.pm005,"#05 火恐龍"));
        lstData.add(new DataItem(R.drawable.pm006,"#06 噴火龍"));
        lstData.add(new DataItem(R.drawable.pm007,"#07 傑尼龜"));
        lstData.add(new DataItem(R.drawable.pm008,"#08 卡咪龜"));
        lstData.add(new DataItem(R.drawable.pm009,"#09 水箭龜"));
        lstData.add(new DataItem(R.drawable.pm010,"#10 綠毛蟲"));
        lstData.add(new DataItem(R.drawable.pm011,"#11 鐵甲蛹"));
        lstData.add(new DataItem(R.drawable.pm012,"#12 巴大蝶"));
        lstData.add(new DataItem(R.drawable.pm013,"#13 獨角蟲"));
        lstData.add(new DataItem(R.drawable.pm014,"#14 鐵殼蛹"));
        lstData.add(new DataItem(R.drawable.pm015,"#15 巨針蜂"));
        lstData.add(new DataItem(R.drawable.pm016,"#16 波波"));
        lstData.add(new DataItem(R.drawable.pm017,"#17 比比鳥"));
        lstData.add(new DataItem(R.drawable.pm018,"#18 大比鳥"));
        lstData.add(new DataItem(R.drawable.pm019,"#19 小拉達"));
        lstData.add(new DataItem(R.drawable.pm020,"#20 拉達"));
        lstData.add(new DataItem(R.drawable.pm021,"#21 烈雀"));
        lstData.add(new DataItem(R.drawable.pm022,"#22 大嘴雀"));
        lstData.add(new DataItem(R.drawable.pm023,"#23 阿柏蛇"));
        lstData.add(new DataItem(R.drawable.pm024,"#24 阿柏怪"));
        lstData.add(new DataItem(R.drawable.pm025,"#25 皮卡丘"));
        lstData.add(new DataItem(R.drawable.pm026,"#26 雷丘"));
        lstData.add(new DataItem(R.drawable.pm027,"#27 穿山鼠"));
        lstData.add(new DataItem(R.drawable.pm028,"#28 穿山王"));
        lstData.add(new DataItem(R.drawable.pm029,"#29 尼多蘭"));
        lstData.add(new DataItem(R.drawable.pm030,"#30 尼多娜"));
        lstData.add(new DataItem(R.drawable.pm031,"#31 尼多后"));
        lstData.add(new DataItem(R.drawable.pm032,"#32 尼多朗"));
        lstData.add(new DataItem(R.drawable.pm033,"#33 尼多力諾"));
        lstData.add(new DataItem(R.drawable.pm034,"#34 尼多王"));
        lstData.add(new DataItem(R.drawable.pm035,"#35 皮皮"));
        lstData.add(new DataItem(R.drawable.pm036,"#36 皮可西"));
        lstData.add(new DataItem(R.drawable.pm037,"#37 六尾"));
        lstData.add(new DataItem(R.drawable.pm038,"#38 九尾"));
        lstData.add(new DataItem(R.drawable.pm039,"#39 胖丁"));
        lstData.add(new DataItem(R.drawable.pm040,"#40 胖可丁"));
        lstData.add(new DataItem(R.drawable.pm041,"#41 超音蝠"));
        lstData.add(new DataItem(R.drawable.pm042,"#42 大嘴蝠"));
        lstData.add(new DataItem(R.drawable.pm043,"#43 走路草"));
        lstData.add(new DataItem(R.drawable.pm044,"#44 臭臭花"));
        lstData.add(new DataItem(R.drawable.pm045,"#45 霸王花"));
        lstData.add(new DataItem(R.drawable.pm046,"#46 派拉斯"));
        lstData.add(new DataItem(R.drawable.pm047,"#47 派拉斯特"));
        lstData.add(new DataItem(R.drawable.pm048,"#48 毛球"));
        lstData.add(new DataItem(R.drawable.pm049,"#49 摩魯蛾"));
        lstData.add(new DataItem(R.drawable.pm050,"#50 地鼠"));
        lstData.add(new DataItem(R.drawable.pm051,"#51 三地鼠"));
        lstData.add(new DataItem(R.drawable.pm052,"#52 喵喵"));
        lstData.add(new DataItem(R.drawable.pm053,"#53 貓老大"));
        lstData.add(new DataItem(R.drawable.pm054,"#54 可達鴨"));
        lstData.add(new DataItem(R.drawable.pm055,"#55 哥達鴨"));
        lstData.add(new DataItem(R.drawable.pm056,"#56 猴怪"));
        lstData.add(new DataItem(R.drawable.pm057,"#57 火爆猴"));
        lstData.add(new DataItem(R.drawable.pm058,"#58 卡蒂狗"));
        lstData.add(new DataItem(R.drawable.pm059,"#59 風速狗s"));
        lstData.add(new DataItem(R.drawable.pm060,"#60 蚊香蝌蚪"));
        lstData.add(new DataItem(R.drawable.pm061,"#61 蚊香君"));
        lstData.add(new DataItem(R.drawable.pm062,"#62 蚊香泳士"));
        lstData.add(new DataItem(R.drawable.pm063,"#63 凱西"));
        lstData.add(new DataItem(R.drawable.pm064,"#64 勇基拉"));
        lstData.add(new DataItem(R.drawable.pm065,"#65 胡地"));
        lstData.add(new DataItem(R.drawable.pm066,"#66 腕力"));
        lstData.add(new DataItem(R.drawable.pm067,"#67 豪力"));
        lstData.add(new DataItem(R.drawable.pm068,"#68 怪力"));
        lstData.add(new DataItem(R.drawable.pm069,"#69 喇叭芽"));
        lstData.add(new DataItem(R.drawable.pm070,"#70 口呆花"));
        lstData.add(new DataItem(R.drawable.pm071,"#71 大食花"));
        lstData.add(new DataItem(R.drawable.pm072,"#72 瑪瑙水母"));
        lstData.add(new DataItem(R.drawable.pm073,"#73 毒刺水母"));
        lstData.add(new DataItem(R.drawable.pm074,"#74 小拳石"));
        lstData.add(new DataItem(R.drawable.pm075,"#75 隆隆石"));
        lstData.add(new DataItem(R.drawable.pm076,"#76 隆隆岩"));
        lstData.add(new DataItem(R.drawable.pm077,"#77 小火馬"));
        lstData.add(new DataItem(R.drawable.pm078,"#78 烈焰馬"));
        lstData.add(new DataItem(R.drawable.pm079,"#79 呆呆獸"));
        lstData.add(new DataItem(R.drawable.pm080,"#80 呆殼獸"));
        lstData.add(new DataItem(R.drawable.pm081,"#81 小磁怪"));
        lstData.add(new DataItem(R.drawable.pm082,"#82 三合一磁怪"));
        lstData.add(new DataItem(R.drawable.pm083,"#83 大蔥鴨"));
        lstData.add(new DataItem(R.drawable.pm084,"#84 嘟嘟"));
        lstData.add(new DataItem(R.drawable.pm085,"#85 嘟嘟利"));
        lstData.add(new DataItem(R.drawable.pm086,"#86 小海獅"));
        lstData.add(new DataItem(R.drawable.pm087,"#87 白海獅"));
        lstData.add(new DataItem(R.drawable.pm088,"#88 臭泥"));
        lstData.add(new DataItem(R.drawable.pm089,"#89 臭泥泥"));
        lstData.add(new DataItem(R.drawable.pm090,"#90 大舌貝"));
        lstData.add(new DataItem(R.drawable.pm091,"#91 刺甲貝"));
        lstData.add(new DataItem(R.drawable.pm092,"#92 鬼斯"));
        lstData.add(new DataItem(R.drawable.pm093,"#93 鬼斯通"));
        lstData.add(new DataItem(R.drawable.pm094,"#94 耿鬼"));
        lstData.add(new DataItem(R.drawable.pm095,"#95 大岩蛇"));
        lstData.add(new DataItem(R.drawable.pm096,"#96 催眠貘"));
        lstData.add(new DataItem(R.drawable.pm097,"#97 引夢貘人"));
        lstData.add(new DataItem(R.drawable.pm098,"#98 大鉗蟹"));
        lstData.add(new DataItem(R.drawable.pm099,"#99 巨鉗蟹"));
        lstData.add(new DataItem(R.drawable.pm100,"#100 霹靂電球"));
        lstData.add(new DataItem(R.drawable.pm101,"#101 頑皮雷彈"));
        lstData.add(new DataItem(R.drawable.pm102,"#102 蛋蛋"));
        lstData.add(new DataItem(R.drawable.pm103,"#103 椰蛋樹"));
        lstData.add(new DataItem(R.drawable.pm104,"#104 卡拉卡拉"));
        lstData.add(new DataItem(R.drawable.pm105,"#105 嘎啦嘎啦"));
        lstData.add(new DataItem(R.drawable.pm106,"#106 飛腿郎"));
        lstData.add(new DataItem(R.drawable.pm107,"#107 快拳郎"));
        lstData.add(new DataItem(R.drawable.pm108,"#108 大舌頭"));
        lstData.add(new DataItem(R.drawable.pm109,"#109 瓦斯彈"));
        lstData.add(new DataItem(R.drawable.pm110,"#110 雙彈瓦斯"));
        lstData.add(new DataItem(R.drawable.pm111,"#111 獨角犀牛"));
        lstData.add(new DataItem(R.drawable.pm112,"#112 鑽角犀獸"));
        lstData.add(new DataItem(R.drawable.pm113,"#113 吉利蛋"));
        lstData.add(new DataItem(R.drawable.pm114,"#114 蔓藤怪"));
        lstData.add(new DataItem(R.drawable.pm115,"#115 袋獸"));
        lstData.add(new DataItem(R.drawable.pm116,"#116 墨海馬"));
        lstData.add(new DataItem(R.drawable.pm117,"#117 海刺龍"));
        lstData.add(new DataItem(R.drawable.pm118,"#118 角金魚"));
        lstData.add(new DataItem(R.drawable.pm119,"#119 金魚王"));
        lstData.add(new DataItem(R.drawable.pm120,"#120 海星星"));
        lstData.add(new DataItem(R.drawable.pm121,"#121 寶石海星"));
        lstData.add(new DataItem(R.drawable.pm122,"#122 魔牆人偶"));
        lstData.add(new DataItem(R.drawable.pm123,"#123 飛天螳螂"));
        lstData.add(new DataItem(R.drawable.pm124,"#124 迷唇姐"));
        lstData.add(new DataItem(R.drawable.pm125,"#125 電擊獸"));
        lstData.add(new DataItem(R.drawable.pm126,"#126 鴨嘴火獸"));
        lstData.add(new DataItem(R.drawable.pm127,"#127 凱羅斯"));
        lstData.add(new DataItem(R.drawable.pm128,"#128 肯泰羅"));
        lstData.add(new DataItem(R.drawable.pm129,"#129 鯉魚王"));
        lstData.add(new DataItem(R.drawable.pm130,"#130 暴鯉龍"));
        lstData.add(new DataItem(R.drawable.pm131,"#131 拉普拉斯"));
        lstData.add(new DataItem(R.drawable.pm132,"#132 百變怪"));
        lstData.add(new DataItem(R.drawable.pm133,"#133 伊布"));
        lstData.add(new DataItem(R.drawable.pm134,"#134 水伊布"));
        lstData.add(new DataItem(R.drawable.pm135,"#135 雷伊布"));
        lstData.add(new DataItem(R.drawable.pm136,"#136 火伊布"));
        lstData.add(new DataItem(R.drawable.pm137,"#137 多邊獸"));
        lstData.add(new DataItem(R.drawable.pm138,"#138 菊石獸"));
        lstData.add(new DataItem(R.drawable.pm139,"#139 多刺菊石獸"));
        lstData.add(new DataItem(R.drawable.pm140,"#140 化石盔"));
        lstData.add(new DataItem(R.drawable.pm141,"#141 鐮刀盔"));
        lstData.add(new DataItem(R.drawable.pm142,"#142 化石翼龍"));
        lstData.add(new DataItem(R.drawable.pm143,"#143 卡比獸"));
        lstData.add(new DataItem(R.drawable.pm144,"#144 急凍鳥"));
        lstData.add(new DataItem(R.drawable.pm145,"#145 閃電鳥"));
        lstData.add(new DataItem(R.drawable.pm146,"#146 火焰鳥"));
        lstData.add(new DataItem(R.drawable.pm147,"#147 迷你龍"));
        lstData.add(new DataItem(R.drawable.pm148,"#148 哈克龍"));
        lstData.add(new DataItem(R.drawable.pm149,"#149 快龍"));
        lstData.add(new DataItem(R.drawable.pm150,"#150 超夢"));
        lstData.add(new DataItem(R.drawable.pm151,"#151 夢幻"));


        ListView listView = (ListView)findViewById(R.id.listView);
        CustomAdapter  adapter = new CustomAdapter(this,R.layout.itemrow,lstData);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                int visible = View.VISIBLE;
                int gone = View.GONE;
                                //int a = position;
                if(position == 0)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p0);
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 1)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p1);
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 2)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p2);
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 3)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p3);
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 4)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p4);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 5)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p5);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 6)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p6);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 7)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p7);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 8)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p8);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 9)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p9);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 10)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p10);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 11)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p11);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 12)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p12);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 13)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p13);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 14)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p14);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 15)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p15);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 16)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p16);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 17)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p17);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 18)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p18);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 19)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p19);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 20)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p20);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 21)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p21);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 22)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p22);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 23)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p23);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 24)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p24);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 25)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p25);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 26)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p26);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 27)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p27);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 28)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p28);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 29)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p29);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 30)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p30);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 31)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p31);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 32)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p32);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 33)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p33);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 34)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p34);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 35)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p35);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 36)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p366);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 37)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p37);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 38)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p38);
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 39)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p39);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 40)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p40);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 41)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p41);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 42)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p42);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 43)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p43);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 44)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p44);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 45)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p45);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 46)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p46);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 47)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p47);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 48)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p48);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 49)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p49);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 50)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p50);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 51)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p51);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 52)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p52);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 53)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p53);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 54)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p54);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 55)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p55);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 56)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p56);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 57)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p57);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 58)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p58);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 59)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p59);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 60)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p60);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 61)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p61);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 62)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p62);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 63)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p63);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 64)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p64);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 65)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p65);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 66)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p66);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 67)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p67);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 68)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p68);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 69)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p69);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 70)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p33);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 71)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p71);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 72)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p72);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 73)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p73);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 74)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p74);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 75)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p75);
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 76)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p76);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 77)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p77);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 78)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p78);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 79)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p79);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 80)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p80);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 81)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p81);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 82)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p82);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 83)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p83);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 84)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p84);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 85)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p85);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 12)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p12);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 86)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p86);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 87)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p87);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 88)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p88);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 89)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p899);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 90)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p90);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 91)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p91);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 92)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p92);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 93)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p93);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 94)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p94);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 95)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p95);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 96)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p96);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 97)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p97);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 98)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p98);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 99)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p99);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 100)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p100);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 101)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p101);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 102)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p102);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 103)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p103);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 104)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p104);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 105)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p105);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 106)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p106);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 107)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p107);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 108)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p108);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 109)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p109);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 110)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p110);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 111)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p111);
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 112)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p112);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 113)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p113);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 114)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p114);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 115)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p115);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 116)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p116);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 117)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p117);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 118)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p118);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 119)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p119);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 120)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p120);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 121)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p121);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 122)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p122);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 123)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p123);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 124)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p124);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 125)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p125);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 126)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p126);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 127)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p127);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 128)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p128);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 129)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p129);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 130)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p130);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 131)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p131);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 132)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p132);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 133)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p133);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 134)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p134);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 135)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p135);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 136)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p136);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 137)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p137);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 138)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p138);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 139)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p139);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 140)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p140);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 141)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p141);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 142)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p142);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 143)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p143);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 144)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p144);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 145)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p145);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 146)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p146);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 147)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p147);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 148)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p148);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 149)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p149);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 150)
                {
                    Intent intent = new Intent();
                    intent.putExtra("Country", lstData.get(position).countryName);
                    intent.putExtra("Flag", lstData.get(position).resIdThumbnall);
                    intent.putExtra("story", p150);/*intent.putExtra("one", grass);intent.putExtra("two", po);*/
                    intent.putExtra("position",position);
                    intent.putExtra("at",visible);
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }


            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
