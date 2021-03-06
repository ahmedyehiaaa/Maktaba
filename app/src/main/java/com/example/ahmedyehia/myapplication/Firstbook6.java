package com.example.ahmedyehia.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Firstbook6 extends AppCompatActivity {


    TextView text1  ;
    Typeface myfont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstbook6);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/me_quran_volt_newmet.ttf");
        text1 = (TextView) findViewById(R.id.text1);


        text1.setText("طريق الترقى\n شُغل الإمام الشاذلى رضي الله عنه بتربية أصحابه سلوكاً وعملاً واقتداء، ولذا لم يترك كتباً فى علوم القوم، ولما سُئل لمَ لا تضع الكتب فى الدلالة على الله تعالى وعلوم القوم؟ قال: كتبي أصحابي\".\n" +
                "ولكنه رضي الله عنه ترك حكماً غالية وإشارات عالية ووصايا راقية، كل حكمة تحتاج إلى مجلدات فى شرح تفصيلها.\n" +
                "وقد قيل له: من شيخك؟ قال: أما فيما مضى فعبدالسلام بن مشيش، وأما الآن فإنى أسقى من عشرة أبحر: خمسة سماوية، وخمسة أرضية، خمسة من الآدميين، النبي صلي الله عليه وسلم وأبوبكر، وعمر، وعثمان، وعلى، وخمسة من الروحانيين: جبريل، وميكائيل، وعزرائيل، وإسرافيل، والروح.\n" +
                "ويعلق ابن عطاء الله على هذا القول بقوله: فانظر رحمك الله إلى ما تشير إليه هذه المنازلات من العلم الغزير والعطاء الكبير.\n" +
                "وربما يرجع السبب فى ذلك إلى أن علوم هذه الطائفة علوم التحقيق، وهى لا تتحملها عقول الخلق ولقد كان أبو العباس المرسى رضي الله عنه يقول:\n" +
                "\"جميع ما فى كتب القوم عبرات دموع من سواحل من بحر التحقيق!\"\n" +
                "ومما أثبته أصحابه من كلامه نسوق هذا المثال الفذّ الذي يبين دقة كلامه وفصاحة عباراته وجمال أسلوبه فى بيان طريق الترقى إلى الله عزوجل وفيه يقول رضي الله عنه وأرضاه:\n" +
                "\"اعلم أن العلوم، التى وقع الثناء على أربابها، وإن جلَّت، فهى ظلمة فى علوم ذوى التحقيق – وهم الذين غرقوا فى تيار بحر الذات، وغموض الصفات، فكانوا هناك بلا \"هُمْ\". وهم الخاصة العليا. وهم الذين شاركوا الأنبياء والرسل فى مراتبهم – وإن جلت مراتب الأنبياء والرسل فلهم منها نصيب. إذ ما من نبي ولا رسول إلا وله من هذه الامة وارث، وكل وارث على قدر ورثه من مورثه، قال النبي صلي الله عليه وسلم: { العُلَمَاءَ وَرَثَةُ الأَنْبِيَاءِ }.\n" +
                "ولا يكون وارث إلا وله نصيب معلوم من مورثه، يقوم مقامه على سبيل إرث العلم والحكمة، على سبيل التحقق بالمقام والحال؛ فإن مقامات الأنبياء قد جلت أن يلمح حقائقها غيرهم. وكل وارث فى المنزلة بقدر مورثه، إذ يقول الله تعالى: \uF07D \uF0F4\uF089\uF073\uF029\uF073\uF039\uF075صلي الله عليه وسلم \uF024\uF075\uF05A\uF0F9\uF03D\uF09E\uF0D2\uF073\uF0F9 \uF075\uF0D9\uF0F7\uF0E8رضي الله عنه\uF02F \uF07A\uF060\uF0BF\uF0CD\uF068\uF08A\uF0CE\uF03B•\uF059\uF039\uF024\uF023 \uF034\uF092\uF06E\uF03Fرضي الله عنه\uF0E3 \uF03C\uF0D9\uF0F7\uF0E8رضي الله عنه\uF02F  \uF07B [55الإسراء]، كذلك فضل بعض الأولياء على بعض، إذ الأنبياء بعين الحق وكل عين مستمد منها على قدرها، وكل ولي له مادة مخصوصة.\n" +
                "فانقسم الأولياء إلى قسمين: قسم منهم هم أبدال الأنبياء، وقسم منهم أبدال الرسل، فأبدال الأنبياء: الصالحون. وأبدال الرسل: الصديقون، فبين الصالحين والصديقين فى التفضيل كما بين الأنبياء والمرسلين. فمنهم ومنهم. غير أن منهم طائفة انفردوا بالمادة من رسول الله صلي الله عليه وسلم، يشهدونها عين يقين – لكنهم قليلون، وهم فى التحقيق كثيرون.\n" +
                "وكل نبي وولي، مادته من رسول الله صلي الله عليه وسلم، فمن الأولياء من يشهد عينه، ومنهم من يخفى عليه عينه ومادته، فيفنى فيما يرد عليه، ولا يشتغل بطلب مادته، بل هو مستغرق بحاله، لا يرى غير وقته.\n" +
                "ومنهم الذين مدوا بالنور الإلهى، فنظروا به حتى عرفوا أمرهم على التحقيق – وذلك كرامة لهم، لا ينكرها إلا من أنكر كرامات الأولياء، فنعوذ بالله من النكران بعد العرفان، وهم الذين أخذوا طريقا لم يأخذه غيرهم، إذ الطريق طريقان: طريق خاصة، وطريق عامة، فأعنى بالخاصة: المحبوبين، الذين هم أبدال الرسل؛ وأعنى بالعامة المحبين، الذين هم أبدال الأنبياء – فعلى جميعهم السلام.\n" +
                "فأما طريق الخاصة فهو طريق علوى تضمحل العقول فى أقل القليل من شرحها، ولكن عليك بمعرفة طريق العامة، وهى طريق الترقى من من منزل إلى منزل وهو \uF07D \uF0CF\uF089\uF079\uF0E8\uF0F8\uF029رضي الله عنه\uF042 \uF041\uF02D\uF0F4\uF089\uF0CF\uF0B9 \uF079\uF089\uF059\uF0CF\uF0E3 \uF037\uF037\uF08B\uF0CE\uF03Dرضي الله عنه\uF042 \uF0A4\uF091\uF0CF\uF089رضي الله عنه\uF047\uF0F8\uF029\uF095\uF042 \uF0C7\uF0CE\uF0CE\uF0C8 \uF07B [القمر]:\n" +
                "-\tفأول طريق يطؤه المحبُّ للترقى منه إلى العلا هو [طريق] النفس؛ فيشغل بأسبابها ورياضتها، إلى أن ينتهى إلى معرفتها.\n" +
                "-\tفإذا عرفها وتحقق بها، فهناك تشرق عليه أنوار المنزل الثاني، وهو القلب فيشتغل بسياسة معرفته ...\n" +
                "-\tفإذا صحَّ له ذلك، ولم يبق عليه منه شيء ... رقى إلى المنزل الثالث، وهو الروح، فيشتغل بسياسته ومعرفته.\n" +
                "-\tفإذا تمت له المعرفة به، هبت عليه أنوار اليقين شيئاً فشيئاً ... حتى إذا أنست بصيرته بترادف الأنوار عليها، برز اليقين عليه بروزاً لا يعقل فيه شيئاً مما تقدَّم له من أنوار المنازل الثلاثة؛ فهناك يَهِمُ ما شاء الله.\n" +
                "-\tثم يُمِده الله بنور العقل الأصلى فى أنوار اليقين، فيشهد موجوداً لا حد له وغاية بالإضافة إلى هذا العبد؛ وتضمحل جميع الكائنات فيه. فتارة يشهدها فيه، كما يشهد الينابيب فى الهواء بواسطة نور الشمس – فإذا انحرف نور الشمس من الكوة، لا يشهد للينابيب أثراً، فالشمس التى يبصر بها: هو العقل الضرورى بعد المادة بنور اليقين.\n" +
                "-\tفإذا اضمحل هذا النور، ذهبت الكائنات كلها، وبقى هو الموجود. فتارة يبقى وتارة يفنى، حتى إذا أريد به الكمال، نودي منه نداءً خفياً لا صوت له، فيُمَدَّ بالفهم عنه.\n" +
                "إلا أن الذى يشهده غير الله، ليس من الله فى شيء. فهناك ينتبه من سكرته، فيقول: \"أي رب أغثني، فإنني هالك!\" فيعلم يقيناً أن هذا البحر لا ينجيه منه إلا الله؛ فحينئذ يقال له أن هذا الموجود هو العقل، الذي قال فيه  رسول الله صلي الله عليه وسلم: { أول ما خلق الله العقل }، وفى خبر آخر: { قال له: أقْبِلْ.فأقبل } ، فأعطى هذا العبد الذل والإنقياد لنور هذا الموجود – إذ لا يقدر على حَدِّه وغايتهِ، فعجز عن معرفته. فقيل له، \"هيهات، لا تَعْرِفُ بِغَيْرهِ!، فأهداه الله بنور أسمائه، فقطع ذلك كلمح البصر، أو كما شاء الله: \uF07D \uF0DF\uF0EC\uF073\uF0F9\uF0F6\uF08Dرضي الله عنه\uF052 \uF03B\uF04D\uF0BB\uF079\uF05F\uF075\uF091\uF079\uF08A \uF060•\uF042 \uF0E2\uF0E4\uF021\uF024رضي الله عنه\uF0B1\uF0AE\uF053  \uF07B [83الأنعام]، فأهداه الله بنور الروح الرباني، فعرف به هذا الموجود، فرقى إلى ميدان الروح الرباني، فذهب جميع ما تحلى به هذا العبد، وتخلى عنه بالضرورة، وبقى كل شيء موجوداً.\n" +
                "ثم أحياه الله بنور صفاته، فأدرجه بهذه الحياة فى معرفة هذا الموجود الرباني، فلما استنشق من مبادئ صفته، كاد يقول: \"هو الله\" فلحقته العناية الأزلية، فنادته: \"ألا إن هذا الموجود هو الذي لا يجوز لأحد أن يصفه، ولا يعبر عنه بشيء من صفاته لغير أهله – لكن بنور غيره يعرفه\".\n" +
                "فأمده الله بنور سرِّ الروح، فإذا هو قاعد على باب ميدان السر، فرفع همته ليعرف هذا الموجود الذي هو السر، فعمى عن إدراكه، فتلاشت جميع أوصافه، كأنه ليس بشيء.\n" +
                "ثم أمده الله بنور ذاته، ما أحياه به حياة باقية، لا غاية لها – فنظر جميع المعلومات بنور هذه الحياة؛ فصار أهل الموجودات نوراً شائعاً فى كل شيء، لا يشهده غيره.\n" +
                "فنودي من قريب: \"لا تغتر بالله، فإن المحجوب من حجب عن الله بالله\" – إذ لا محال أن يحجبه غيره. فيحي بحياة استودعها الله فيه. فقال: \"أي رب بك – منك- إليك، فأقل عثرتى، فإنى أعوذ بك منك، حتى لا أرى غيرك!\".\n" +
                "فهذا هو سبيل الترقى إلى حضرة العلي الأعلى – وهو طريق المحبين، أبدال الأنبياء، والذي يعطى أحدهم من هذا لا يقدر أحد أن يصف منه ذرة؛ والحمد لله على نعمائه، والصلاة على محمد خاتم أنبيائه.\n" +
                "وأما الطريق المخصوص بالمحبوبين: فهو منه إليه – إذ محال أن يتوصل إليه بغيره، فأول قدم لهم بلا قدم، أن ألقى عليهم من نور ذاته، وحبب إليهم الخلوات، وصغرت لديهم الأعمال الصالحات، وعظم عندهم رب الأراضين والسماوات.\n" +
                "فبينما هم كذلك، إذ ألبسهم ثوب العلم، فنظروا فإذا هُمْ، ولا هُمْ، ثم أردف عليهم ظلمة غيَّبَتْهُم عن نظرهم، بل صار عدماً لا علة له، فلا معرفة تتعلق به، اضمحلت المعلومات، وزالت المرسومات، زوالاً لا علة فيه، وبقي من أشير إليه، لا وصف له، ولا صفة له، ولا ذات، فاضمحلت النعوت والأسماء والصفات، فلا اسم ولا صفة ولا ذات.\n" +
                "فهناك ظهر من لم يزل ظهوراً لا علة فيه – بل أظهر سره لذاته، في ذاته، ظهوراً لا أولية له – بل نظر من ذاته لذاته فى ذاته، فحيى هذا العبد بظهوره حياة لا علة لها، فصار أولاً فى الظهور، لا ظاهر قبله، فوُجدت الأشياء بأوصافه، وظهرت بنوره فى نوره.\n" +
                "فأول ما ظهر: سره، فطهر به قلبه، ثم ظهر أمره بسره فى سره، وظهرت بأمره الذوات فى نور القلم بنور القلم، ثم ظهر عقله بأمره فى أمره، وظهر به عرشه فى نور لوحه بنور لوحه، ثم ظهر روحه بعقله فى عقله، وظهر بروحه كرسيُّه فى نور عرشه بنور عرشه، ثم ظهر قلبه بروحه فى روحه، فظهر بقلبه حجبه فى نور كرسيه، ثم ظهرت نفسه بقلبه فى قلبه، فظهر بنفسه فلك للخير وللشر فى نور حجبه بنور حجبه، ثم ظهر جسمه بنفسه فى نفسه، فظهر بجسمه أجسام العالم الكثيف من أرض وسماء – وعلى الجملة، كل كثيف فى نور الفلك، بنور الفلك.\n" +
                "فإذاً أول قدم هذا المحبوب الفرد طرح النفس عدماً، فهو طرح لا علة فيه، فهو استقبال العدم بسقوط الأولية والآخرية، والظاهرية والباطنية، فيكون استقبال صفة معدومة لمعدوم، ومعنى \"الصفة المعدومة\" أي لما انتهى العبد، بدليل العلة، وهو شهود الحق كلاً شهادة متصلة غير منفصلة، شهادة لا غفلة فيها، قام عليه دليل لا علة فيه، ولا لهُ، وهو شهود العدم المحض.\n" +
                "ومعنى \"قيام الدليل الذي لا علة فيه\": ضرورة عدم المخلوقات المشهودات، هو ذاك، فيرادف عليه ذلك العدم المحض، وهو سكرة النسيان الدائم أبداً، حتى الحياة التى أشير إليها فيما تقدم من الكلام على هذا المقام.\n" +
                "فإذاً طريق هذا العبد، طريق علوي، أول ما طُرح فى بحر الذات فانعدم، فأحيا حياة طيبة، فنُقل من غير تنقل إلى بحر الصفات، ثم إلى بحر الأمر الرباني، ثم إلى بحر السر، ثم إلى بحر القلم الأصلي، ثم إلى بحر الروح، ثم إلى بحر القلب، ثم إلى بحر النفس، ثم إلى بحر الحسِّ، ثم لقيه بحر السر، فطرحه فى بحر القلمية، ثم بحر اللوحية، ثم بحر العرشية، ثم بحر الكرسي، ثم بحر الحُجِّيِّة ثم بحر الفلكية.\n" +
                "فلقيه بحر السر المحيط، فطرحه فى بحر المَلَكيِّة، ثم بحر الأبالسة، ثم بحر الجنسية، ثم بحر الإنسية، فلقى هناك بحر السر، فطرحه فى بحر الجنان، ثم بحر النيران، ثم طرحه فى بحر الإحاطة، وهو بحر السر، فغرق هناك غرقاً، لا خروج له منه أبداً – إلا بإذن الله، فإن شاء بعثه، عِوضاً من الرسول، يُحي به عباده؛ وإن شاء ستره، يفعل فى ملكه ما يشاء.\n" +
                "وكل بحر من هذه الأبحر، قد انطوت فيه أبحر شتى، لو دخل الصّالح، الذي هو بدل الرسول فى أقل بحر من هذه الأبحر لغرق فيه غرقاً لا نجاة له منه، فهذه عبرة من بيان طريقي الخصوص والعموم، والحمد لله وحده.\n");
        text1.setTypeface(myfont);

    }

}