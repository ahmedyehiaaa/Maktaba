package com.example.ahmedyehia.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Firstbook3 extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5;
    Typeface myfont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstbook3);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/me_quran_volt_newmet.ttf");
        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);
        text5 = (TextView)findViewById(R.id.text5);

        text1.setTypeface(myfont);
        text2.setTypeface(myfont);
        text3.setTypeface(myfont);
        text4.setTypeface(myfont);
        text5.setTypeface(myfont);

        text1.setText("الميراث  النورانى\nورد  فى  الأثر  الذى  اشتهر  ...  أن  معاشر  الأنبياء  لا  يورِّثون  درهماً  ولا  ديناراً  وإنما  يورثوا  علماً  ونوراً    ...\n" +
                "وقد  هام  الشيخ    رضي  الله  عنهفي  مولاه  عز  وجل  حبا،  حتى  صار  لا  محبوب  له  سواه،  وذاق  أنسه  فقطعه  عن  كل  مصحوب  ...\n" +
                "ومن  أحب  الله،  وأحبه  لله،  فقد  تمت  ولايته  بالحب،  والمحب  على  الحقيقة،  من  لا  سلطان  على  قلبه  لغير  محبوبه،  ولا  مشيئة  له  غير  مشيئته،  وقد  تحدث  رضي  الله  عنه  عن  حقيقة  المحبة  فقال:\n" +
                "  هي  رؤية  المحبوب  على  العيان  .\n" +
                "وعن  كمالها  قال:\n" +
                "    هي  فقدانك  فى  كل  وقت  وأوان      ثم  وصفها  وصف  خبير  بها  ذائق  لشرابها  فقال:    المحبة  آخذة  من  الله  لقلب  عبده،  عن  كل  شيء  سواه،  فترى  النفس  مائلة  لطاعته،  والعقل  متحصنا  بمعرفته،  والروح  مأخوذة  فى  حضرته،  والسر  مغموراً  فى  مشاهدته،  والعبد  يستزيد  فيزاد،  ويُفاتح  بما  هو  أعذب  من  لذيذ  مناجاته،  فيكسى  حلل  التقريب  على  بساط  قربه،  ويمسّ  أبكار  الحقائق،  وثيّبات  العلوم.  \n" +
                "فمن  أجل  ذلك  قالوا:\n" +
                "  أولياء  الله  عرائس،  ولا  يرى  العرائس  المجرمون  \n" +
                "فلما  تحقق  رضي  الله  عنه  بكمال  العبودية،  خلع  الله  عز  وجل  عليه  خلع  الوراثة  المحمدية  حتى  وصل  إلى  مقام  فى  معرفة  الله  عز  وجل  قال  عنه:  \n" +
                "أصحاب  رسول  الله  صلي  الله  عليه  وسلم  خصوا  بالعمل،  والتابعين  ليُقتدى  بهم،  وخُص  أهل  زماننا  بالمعرفة،  وجعلت  أعرفهم  بالله  .\n" +
                "وظل  يرتقى  فى  مقام  المعرفة  حتى  قال:\n" +
                "  رأيت  رسول  الله  صلي  الله  عليه  وسلم،  فقلت  له:    يا  سيدي  يا  رسول  الله،  ادع  الله  أن  يجعلنى  رحمة  للعاملين،  فقال:    أنا  هو  ذاك  يا  على،  والولي  رحمة  فى  العالمين  \n" +
                "ووصف  رضي  الله  عنه  الليلة  التى  أكرمه  الله  فيها  بميراث  الكتاب  الذي  يقول  فيه  عز  شأنه  \uF07D  \uF0A7\uF04E\uF0E8\uF04F  \uF024\uF075\uF05A\uF0F8\uF04F\uF075\uF091\uF0F7صلي  الله  عليه  وسلمصلي  الله  عليه  وسلم\uF026  \uF07C\uF03D\uF0BBرضي  الله  عنه\uF047\uF0C5\uF033\uF0F8\uF039\uF024\uF023  رضي  الله  عنه\uF0FB\uF0EF\uF0CF\uF025\uF0A9\uF021\uF024\uF023  \uF024\uF075\uF05A\uF0F8\uF08A\uF078\uF0FF\uF073\uF0DC\uF0F4\uF0B9\uF024\uF023  \uF0F4\uF060\uF0CF\uF042  \uF028\uF024رضي  الله  عنه\uF052\uF0CF\uF08A\uF024رضي  الله  عنه\uF037\uF0CF\uF0E3    \uF07B  [32فاطر]،  فيقول:\n" +
                "    ليلة  أخذت  ميراثى  من  جدي  رسول  الله  صلي  الله  عليه  وسلم  أخذني  جدي  الحسين  رضي  الله  عنه  وعمل  إصبعه  فى  سُرّتى،  وأدارني  على  رأسه،  حتى  بقيت  السموات  والأرض،  والعرش  والكرسي  بين  يديّ  كالكرة،  فقيل  لي:  قل:\n" +
                "  اللهم  إني  أسألك  من  النور  الذي  رأى  به  سيدنا  محمد  رسولك  صلي  الله  عليه  وسلم  ما  كان  وما  يكون،  ليكون  العبد  –بوصف  سيّده،  لا  بوصف  نفسه  –  غنيا  عن  تحديد  النظر  بشيء  من  المعلومات،  ولا  يلحقه  عجز  عما  أراد  من  المقدورات،  ومحيطاً  بذات  السّر  بجميع  أنواع  الذوات،  ومُرتِّبا  للبدن  مع  النفس،  وللقلب  مع  العقل،  وللروح  مع  السّر،  وللأمر  مع  البصيرة،  وللصفات  مع  الصفات  \n" +
                "وتحدث  عن  العطاء  الذي  ناله  فى  تلك  الليلة  من  الله  فقال:\n" +
                "    ليلة  أخذت  ميراثي  من  جدي  رسول  الله  صلي  الله  عليه  وسلم  مُكّنت  من  خزائن  الأسماء،  فلو  أن  الإنس  والجن  يكتبون  عنّي  إلى  يوم  القيامة  لكلّوا  وملّوا  \n" +
                "وبين  رضي  الله  عنه  حاله  عند  نزول  المدد  الإلهي  عليه  فيقول:\n" +
                "  والله  إنه  لينزل  علىّ  المدد،  فأرى  سريانه  فى  الحوت  فى  الماء  ....،  والطائر  فى  الهواء  ....  .\n" +
                "ويوضح  تمكنه  من  العلم  اللدني  الذي  آتاه  مولاه  سرَّ  قوله  سبحانه:\n" +
                "\uF07D  \uF0E7\uF06D\uF0BB\uF06F\uF059\uF0F7\uF08F\uF073\uF03F\uF023\uF075\uF0E4  \uF05A\uF070رضي  الله  عنهم\uF04A\uF0F4\uF06D\uF075\uF091  \uF0F4\uF060\uF0CF\uF069\uF042  \uF024رضي  الله  عنه\uF052\uF0CF\uF089\uF05A\uF0CF\uF0E3  \uF0E7\uF06D\uF0BB\uF06F\uF059\uF0F7\uF04B\uF0AF\uF03Dرضي  الله  عنه\uF0E6\uF075صلي  الله  عليه  وسلم  \uF060\uF0CF\uF042  \uF024\uF0AF\uF052\uF0E0\uF024\uF0A9\uF021  \uF024\uF056\uF04A\uF0F9\uF03D\uF0CF\uF0E3  \uF0C7\uF0CF\uF0CE\uF0C8    \uF07B  [  الكهف]،  فيقول  رضى  الله  عنه  وأرضاه:\n" +
                "    والله  لقد  تسألوني  عن  المسألة،  لا  يكون  عندي  لها  جواب،  فأرى  الجواب  مُسَطَّراً  فى  الدواة  والحصير  والحائط  .\n" +
                "وقد  قال  سيدي  عبدالوهاب  الشعراني:\n" +
                "بلغنا  أن  الشيخ  الكامل  أبا  الحسن  الشاذلي،  لما  فنى  اختياره  مع  الله،  مكث  ستة  أشهر،  لا  يتجرأ  أن  يسأل  الله  شيئاً  فى  حصول  شيء  ثم  نودى  في  سره:    اسألنا  عبودية  لا  ترجيح  فيها  للعطاء  عن  المنع  ،  قال:\n" +
                "  فسألت  الله  ورجوته  امتثالاً،  لا  تحجيرا  عليه،  فإنه  يخلق  ما  يشاء  ويختار،  وليس  معه  اختيار  .\n" +
                "كذلك  روى  أن  الشيخ  مسلم  المسلمى:\n" +
                "  دخل  على  الشيخ  أبو  الحسن  الشاذلي  وهو  بقلعة  الإسكندرية،  فقال:    يا  سيدي!  دلونى  عليك،  أنك  تدل  الخلق  على  الله  ،  فقال  رضي  الله  عنه:    ذلك  لعامة  الأولياء،  بل  الرجل  الكامل  الذي  يقول:  ها  أنت  وربك  \n" +
                "وهكذا  كمل  الشيخ  فى  مقامات  الولاية  والتربية  الربانية  حتى  تحقق  ظاهراً  وباطناً  بالوراثة  للعلوم  الإلهامية،  والأنوار  الربانية  فأصبح  بحق  من  أهل  الكمال  المشار  إليهم  فى  الآية  القرآنية:\n" +
                "\uF07D  \uF0F6\uF040\uF0E8\uF025  \uF0BE\uF0CD\uF06E\uF0C9\uF08B\uF0BBرضي  الله  عنهم    \uF0FE\uF092\uF0CD\uF03F\uF08A\uF0CE\uF036رضي  الله  عنهم\uF099  \uF028\uF023\uF0FE\uF071\uF0E3\uF0E3\uF0F7\uF08Aصلي  الله  عليه  وسلم\uF026  \uF092\uF06E\uF03C\uF0CE\uF029  \uF0AB\uF021\uF024\uF023  \uF034  \uF034\uF092\uF06E\uF03Fرضي  الله  عنه\uF0E3  \uF03E\uF06F\uF075\uF08E\uF08D\uF0C5\uF0C1رضي  الله  عنه\uF02F  \uF04F\uF024رضي  الله  عنه\uF052صلي  الله  عليه  وسلم\uF026  \uF0C7\uF060رضي  الله  عنه\uF042\uF075صلي  الله  عليه  وسلم  \uF0D3\uF0CD\uF05Fرضي  الله  عنهم\uF0E8رضي  الله  عنه\uF036•\uF03F\uF024\uF023    \uF07B  [108يوسف]\n" +
                "ولذلك  وصفه  سيدي  أبو  العباس  المرسى  رضي  الله  عنه  فى  إحدى  مكاتباته  لبعض  أصحابه  بتونس  فقال:\n" +
                "  فإني  صحبت  رأساً  من  رؤوس  الصديقين،  وأخذت  منه  سرّا،  لا  يكون  إلا  لواحد  بعد  واحد،  والشرح  يطول،  وبه  أفتخر،  وإليه  أنسب،  وهو:  أبو  الحسن  الشاذلي.  وكان  لا  يصحبه  أحد  إلا  فُتح  له  فى  يومين  أو  ثلاثة،  فإن  لم  يجد  شيئاً  بعد  ثلاثة  أيام،  فهو  كذّاب،  أو  يكون  صادقاً،  ولكنه  أخطأ  الطريق،  ودليله  من  كتاب  الله  عز  وجل:\n" +
                "  \uF07D  رضي  الله  عنه\uF041\uF024\uF073\uF025  \uF0C9\uF062\uF03E\uF075\uF091  \uF040رضي  الله  عنهم\uF0E8\uF0F4\uF05F\uF024\uF023  \uF0FE\uF092\uF0CD\uF06B\uF03C  \uF05A\uF070رضي  الله  عنه\uF083\uF023\uF075\uF0E4  \uF028  رضي  الله  عنه\uF041\uF024\uF073\uF025  رضي  الله  عنهم\uF037\uF0E7\uF047رضي  الله  عنه\uF083\uF023\uF075\uF0E4  \uF09E\uF077صلي  الله  عليه  وسلم\uF026  \uF07A\uF04F\uF0CF\uF06B\uF03D\uF078\uF036\uF0E8\uF03F  \uF07D•\uF024•\uF059\uF039\uF024\uF023  \uF073\uF070\uF073\uF057\uF0BB\uF06E\uF03Dصلي  الله  عليه  وسلم\uF04F  \uF042\uF051\uF024\uF0AD\uF083صلي  الله  عليه  وسلم\uF026  \uF09E\uF077\uF0CE\uF029  \uF023\uF059\uF093\uF0F8\uF042\uF075\uF091  \uF033    \uF07B  [41آل  عمران].\n" +
                "وكان  يقول:    إذا  عرضت  لك  حاجة  إلى  الله،  فأقسم  عليه  بي  .\n" +
                "فكنت  والله  لا  أذكره  فى  شدة  إلا  انفرجت،  ولا  أمر  صعب  إلا  هان.  وأنت  يا  أخي،  إذا  كنت  فى  شدة،  فأقسم  على  الله  به،  وقد  نصحتك  والله  يعلم،  والسلام  .\n");

        text2.setText("الإذن  بالدعوة\nإن  حياة  الأولياء  الكمَّل  تكون  أولاً  هجرةً  إلى  الله:\n" +
                "\uF07D  رضي  الله  عنه\uF041\uF024\uF073\uF025\uF075صلي  الله  عليه  وسلم  \uF092\uF0CE\uF06F\uF054\uF0CE\uF029  \uF0ED\uF08D\uF0C5\uF05F\uF024رضي  الله  عنهم\uF067\uF0E3\uF042  \uF034\uF092\uF06E\uF03C\uF0CE\uF029  \uF0FE\uF092\uF0CE\uF06E\uF031\uF075\uF091    \uF07B  [26العنكبوت]\n" +
                "ذهاباً  إليه  سبحانه  جلَّ  فى  علاه:\n" +
                "\uF07D  رضي  الله  عنه\uF041\uF024\uF073\uF025\uF075صلي  الله  عليه  وسلم  \uF092\uF0CE\uF06F\uF054\uF0CE\uF029  \uF0EB\uF03D\uF0CF  \uF023\uF073\uF08C  \uF034\uF092\uF06E\uF03C\uF0CE\uF029  \uF092\uF0CE\uF06E\uF031\uF075\uF091  \uF07B[99الصافات]\n" +
                "فراراً  إليه  تعالى  ممَّا  سواه:\n" +
                "\uF07D  \uF028\uF023\uF0FFصلي  الله  عليه  وسلم\uF094\uF08D\uF0CF\uF0FF\uF073\uF0F9  \uF092\uF06E\uF03C\uF0CE\uF029  \uF0AB\uF021\uF024\uF023    \uF07B  [50الذاريات]\n" +
                "إنها  فرارٌ  إلى  الله  بالتعبد  والنسك،  حتى  يخلو  القلب  عمَّا  سوى  الله،  ويمتلئ  بالله  ....  إنها  فترة  الغار  والتحنَّث.\n" +
                "حتى  إذا  امتلأ  القلب  بالله  ...\n" +
                "وتطهَّرت  النفس،  وأصبحت  خيراً  بَحْتاً،  ونوراً  يسُتضاء  به  ....\n" +
                "كانت  المرحلة  الثانية:  مرحلة  الرجوع  إلى  عباد  الله  للهداية  والإرشاد!\n" +
                "فيؤمر  الولى  أن  يترك  الخلوة  والعزلة،  وينزل  إلى  الميدان  مؤيدا  من  الله،  يدعو  إلى  الله  على  بصيرة،  ويرشد  مأذونا  مأمورا.\n" +
                "ويحكى  أبو  الحسن  كيفية  نزوله  من  جبل  زغوان  ومغادرة  العزلة  فيقول:  قيل  لي:  يا  على  اهبط  إلى  الناس  ينتفعوا  بك،  قلت:  يا  رب  أقلني  من  الناس،  فلا  طاقة  لي  بمخالطتهم.\n" +
                "قيل  لي:  انزل  فقد  أصحبناك  السلامة،  ودفعنا  عنك  الملامة.\n" +
                "قلت:  تكلنى  إلى  الناس  آكل  من  دريهماتهم!!  ..  قيل  لي:  أنفق  يا  على،  وأنا  الملىّ،  إن  شئت  من  الجيب  وإن  شئت  من  الغيب\n" +
                "ونزل  الشيخ  من  شاذلة  بعد  أن  عُرف  هناك  وذاع  صيته،  وبدأت  أحواله  تسير  وفق  ما  حكاه  شيخه  له  فعُرف  منذ  ذلك  الحين  بالشاذلي،  وبدأ  الناس  يقصدونه،  ثم  إنه  خرج  عن  رباطه  فاتخذ  له  دارا  بمسجد  (البلاط)  بمدينة  تونس،  وأصبح  ينتقل  بينها  وبين  زاويته  بجبل  زغوان.\n" +
                "ونذكر  هنا  ماحكاه  رضي  الله  عنه  فيما  يتعلق  بنسبته  إلى  شاذلة،  قال:  \n" +
                "قلت:  يا  رب  لم  سميتني  بالشاذلي،  ولست  بشاذلي؟  ..  فقيل  لي:\n" +
                "يا  على،  ما  سميتك  بالشاذلي  وإنما  أنت  الشاذّ  لي  (بتشديد  الذال  المعجمة)  يعني:المفرد  لخدمتى  ومحبتي.\n" +
                "وأصبحت  دروس  الشيخ  الشاذلي  ومواعظه  وتعاليمه  بالمسجد  من  الأمور  التى  يحرص  على  الذهاب  إليها  مئات  المريدين،  فبدأت  حلقة  الشيخ  تتسع  يوما  بعد  يوم،  ويزداد  صيته  فى  طول  البلاد  وعرضها،  فكان  إذا  جلس  للدرس  التف  حوله  الأتباع  المتكاثرون  ....،  وإذا  سار  مشى  فى  ركبه  عشرات  ...  وعشرات.\n" +
                "ولم  تكن  تونس  غريبة  على  أبي  حسن  فقد  دخلها  من  قبل  طفلاً،  وأقام  بها  شابا  يافعاً،  وفيها  تلقى  دروسه  الأولى،  وفيها  كانت  له  مناظرات  سابقة  مع  علمائها  وفقهائها.\n" +
                "أما  هذه  المرة،  فقد  وفد  عليها  الآن  رجلاً  مكتمل  الرجولة  ....  عالما  وافر  العلم  ...  صوفيا  صاحب  حالات  وكرامات  .....  ،  لهذا  لم  يكن  غريباً  أن  يقبل  عليه  الناس  من  كل  حدب  وصوب  ..،  يغترفون  من  علمه،  ويتأدبون  بآدابه،  ويستمعون  إلى  دروسه  ومواعظه  وتعاليمه،  ويلتمسون  منه  الدعاء  والبركة.\n" +
                "قال  المناوى  فى  الكواكب  الدرية:\n" +
                "  كان  الشيخ  أبو  الحسن  إذا  ركب  تمشى  أكابر  الفقراء  وأكابر  الدنيا  حوله،  وتنشر  الأعلام  على  رأسه،  وتضرب  الكاسات  بين  يديه  \n" +
                "وقد  صحبه  جمهرة  من  العلماء  والزهاد،  منهم:\n" +
                "أبو  الحسن  على  بن  مخلوف  الصقلى،  وأبو  عبدالله  الصابونى،  وأبو  محمد  بن  عبدالعزيز  الزيتوني،  وأبو  عبدالله  البجائى  الخياط،  وأبو  عبدالله  الجارحى  الخياط،  واختص  بخدمته  أبو  العزائم  ماضى،  وكلهم  أصحاب  كرامات،  على  حد  تعبير  صاحب  درة  الأسرار.\n" +
                "يقول  الدكتور  عبدالحليم  محمود  فى  كتابه  النفيس  (أبو  الحسن  الشاذلى)  ص  33،32  متحدثاً  عن  الدعاة  إلى  الله:\n" +
                "  ومن  المعلوم  –فى  الأعراف  الدينية-  أن  الدعاة  إلى  قسمين:\n" +
                "دعاة  إلى  الله  قد  أذن  الله  لهم  فى  نطاق  الإذن  العام،  أو  الواجب  العام  فى  الأمر  بالمعروف  والنهى  عن  المنكر،  وهؤلاء  يتفاوت  تأثيرهم  بتفاوتهم  فى  صفاء  النفس،  وفى  طلاقة  اللسان،  وفى  العلم  بالكتاب  الكريم  والسنة  الشريفة،  وبعضهم  لا  تأثير  له  قط:  لأنه  لم  تصف  نفسه،  أو  لأن  به  لكنة،  أو  لجهله  الكتاب  والسنة،  أو  لغير  ذلك  من  الأسباب.\n" +
                "والقسم  الثاني  من  الدعاة  هم  الذين  يدعون  على  بصيرة،  وهم  الذين  قد  أذنوا  بإذن  خاص،  وأمروا  بأمر  خاص:  إنهم  هؤلاء  الذين  سمعوا  النداء،  وهم  لم  يسمعوا  النداء  مصادفة  واتفاقا،  كلا،  إنهم  جاهدوا  أنفسهم  حتى  أطاعت،  وغذوا  قلوبهم  بالطاعات  حتى  استنارت،  وأصبح  سرهم  مع  الله  فأضحوا  من  أوليائه.\n" +
                "وهم  ينتظرون  الإذن  فى  كل  شيء  من  الأمور،  حتى  المباح  منها  فضلا  عن  الإذن  الخاص  بالدعوة.\n" +
                "يقول  أبو  الحسن  مفسراً  معنى  الإذن  فى  المباح  ومعناه  فى  حق  الولي:\n" +
                "  نور  ينبسط  على  القلب  يخلقه  الله  فيه  وعليه  فيمتد  ذلك  النور  على  الشيء  الذي  يريد  فيدركه  نور  مع  نور،  أو  ظلمة  تحت  نور.\n" +
                "فذلك  النور  ينبئك  أن  تأخذ  إن  شئت،  أو  تترك،  أو  تقبل  أو  تدبر،  أو  تعطى  أو  تمنع،  أو  تقوم  أو  تجلس،  أو  تسافر  أو  تقيم.\n" +
                "هذا  باب  المباح  المأذون  فيه  بالتخيير.\n" +
                "فإذا  قارنه  القول  تأكد  الفعل  المباح  بمراد  الله  تعالى.\n" +
                "فإذا  قارنته  نية  صحيحة  لفعل،  برز  عن  حكم  المباح  وعاد  مندوبا.\n" +
                "وإن  ظهرت  الظلمة  تحت  النور  الممتد  من  القلب  ...،  فلا  يخلو  أن  يلوح  عليها  لائح  القبض  بانقباض  القلب  ...  فاحذر  ذلك  وتجنبه!،  فإنه  المحذور  أو  يكاد.\n" +
                "ولا  تقطع  ذلك  إلا  ببينة  من  كتاب  الله  عز  وجل  أو  سنة  أو  إجماع،  فإن  تلك  الظلمة  شبه  غيم  لا  ينصدع  معه  القلب،  ولا  يتفرغ  به  الذهن  فتباعد  عنه  فإنه  يكاد  يكون  مكروها  ...  ولا  تحكم  بعقلك  ورأيك  فقد  ضل  من  هنا  خلق  كثير  .\n" +
                "وأصحاب  هذا  النور،  يدعون  إلى  الله  بكيانهم  كله.\n" +
                "إن  صمتهم  دعوة  إلى  الله،  وإن  سيرهم  دعوة  إلى  الله،  وإن  جلوسهم  دعوة  إلى  الله،  وإن  عملهم  دعوة  إلى  الله،  وإن  حديثهم  دعوة  إلى  الله.\n" +
                "ويستجيب  لهم  الناس  سراعا  بمقدار  ما  في  قلوبهم  من  خير،  وما  فى  أفئدتهم  من  إيمان،  وينأى  عنهم  من  ليس  له  فى  الخير  نصيب،  ويحاربهم  من  حقت  عليه  كلمة  العذاب  .\n" +
                "وفى  رواية  أخرى  لكيفية  تلقيه  رضي  الله  عنه  الإذن  بدعوة  الخلق  إلى  الله،  قال  السيد  الجليل  أبو  المحاسن  القاوقجى  رضي  الله  عنه  فى  كتابه  (الدرر  البهية)  ما  ملخصه:\n" +
                "  لما  مكث  الإمام  الشاذلي  رضي  الله  عنه  يعبد  الله  لله  متخلياً  عن  كل  ما  سواه،  رأى  الصديق  فى  منامه  وألبسه  تاجا  وقال  له:    أخرج  إلى  الناس  ينتفعون  بك    فمكث،  فرأى  الخضر  عليه  السلام  وألبسه  كذلك،  وقال  له:    أخرج  إلى  الناس  ينتفعون  بك    فمكث  !!\n" +
                "فرأى  النبي  صلي  الله  عليه  وسلم  وألبسه  كذلك،  وقال  له:    يا  مبارك  أخرج  إلى  الناس  ينتفعون  بك  ...  فعند  ذلك  تجلّى  عليه  مولاه  عز  وجل  وقال  له:\n" +
                "يا  عبدي  إنّى  خلقتك  من  صفوتي،  وجعلتك  رحمة  فى  خلقى،  فاخرج  إليهم  وعلمهم  مما  علمتك  من  حكمتى.  \n" +
                "فقال:    إلهى  وسيدي،  أقلني  من  الناس،  فإنه  لا  طاقة  لي  بمخالطتهم،  فقال  له:  قد  أصحبناك  السلامة،  ورفعنا  عنك  الملامة،  فقال:  إلهى،  تكلنى  إلى  الناس،  آكل  من  دُريهماتهم؟،  فقال  له:  أنفق  يا  علىّ،  وأنا  الملي،  إن  شئت  من  الجيب  وإن  شئت  من  الغيب،  فخرج  رضي  الله  عنه  فسعى  إليه  الناس  من  كل  فجّ.\n" +
                "وهنا  يقول  رضي  الله  عنه:\n" +
                "  إلهى  طلبتك  وطلبت  الخلق  إليك  فأعنّى  على  الوصول  والتوصيل  إليك،  واجمعنى  واجمع  بى  من  تشاء  عليك  .\n" +
                "\n" +
                "وأيّا  كانت  الطريقة  التى  تلقى  بها  الإذن  فإنه  لم  يأخذ  فى  الدعوة  إلى  الله  إلا  بعد  تحققه  بقول  مولاه:\n" +
                "\uF07D  \uF024•\uF08A\uF0CF\uF0E3\uF023رضي  الله  عنهم\uF08A\uF075صلي  الله  عليه  وسلم  \uF092\uF06E\uF03C\uF0CE\uF029  \uF0AB\uF021\uF024\uF023  \uF0BE\uF0CF\uF06D\uF0CF\uF052\uF0F8\uF08C\uF0CE\uF02A\uF0CE\uF02F    \uF07B  [46الأحزاب]\n" +
                "وبعد  ذلك  توجه  رضي  الله  عنه  ملحوظاً  بعناية  مولاه،  مؤيداً  بأسراره،  متوجاً  بأنواره،  إلى  تونس،  فانجذبت  إليه  القلوب  والأرواح،  وانقادت  لديه  النفوس  والأشباح،  فعلا  ذكره  واشتهر  وكما  يقول  العارف  بالله  الشيخ  أحمد  ابراهيم  العيسوى  فى  كتابه  (نعيم  الجنان)  ص16:\n" +
                "  وقد  جمع  الله  فى  هذا  السيد  الإمام  ما  تفرّق  فى  غيره  من  الأعلام:\n" +
                "فكان  رضي  الله  عنه  إماماً،  عالماً  عاملاً،  حجّة  حافظاً،  خطيباً  واعظا،  صدّيقاً  عابدا،  عارفا  زاهدا.\n" +
                "أما  علوم  الحقيقة  فهو  قطب  رحاها،  وشمس  ضحاها،  وبدر  سناها،  يغترف  من  بحره  كل  غارف،  ويرتوي  من  نوره  كل  عارف.\n" +
                "وقد  اختص  بعلوم  الحقيقة  خاصة  أتباعه  الكاملين  ...،  وسلك  بهم  مناهج  المقربين  .....،  وفتح  لهم  كنوز  الأسرار  .....،  وأفاض  عليهم  سحائب  الأنوار  ......\n" +
                "وكان  رضي  الله  عنه  عاملا  على  نشر  فضائل  الدين  لا  ينحرف  قيد  شعرة  عن  جادة  الشريعة  الغراء.\n");

        text3.setText("أحقادٌ  ودســــــــــــائس\nقال  صلي  الله  عليه  وسلم  فى  الحديث  الشريف  الذى  يبين  الغيب  لكل  ذي  عقل  ولب:  \n" +
                "{  كلُّ  ذِي  نِعْمَـــــــةٍ  مَحْسُـــــــــــودٌ  }   \n" +
                "هذا  الإقبال  المتزايد  أثار  حقد  العلماء  وحسد  الفقهاء  فى  تونس،  فتعرض  لمحنة  كبيرة،  كان  شيخه  أخبره  بها  بقوله:    ويؤتى  عليك  بها  من  قبل  السلطنة    ...  كيف  كان  ذلك؟\n" +
                "كان  قاضى  الجماعة  وعالمها  فى  تونس  على  ذلك  الوقت  هو  أبوالقاسم  بن  البرَّاء،  وقد  أخذت  الغيرة  تنهش  فى  قلبه  ...،  كلما  رأى  إقبال  الناس  على  أبى  الحسن،  فبدأ  يكيد  لأبى  الحسن  وسعى  به  لدى  سلطان  تونس  أبى  زكريا  الحفصى،  واتهمه  بأنه  يتآمر  على  سلطانه  فهو  حسنى  علوى،  ولعله  يسعى  لإقامة  ملك  لنفسه  كما  أقام  الفاطميون  ملكهم  من  قبل  فى  تونس  نفسها.\n" +
                "ولم  يقنع  ابن  البرَّاء  بهذه  التهمة  الخطيرة،  فاتهم  أبا  الحسن  بتهمة  أخرى  لا  تقل  عنها  خطورة،  اتهمه  بالزندقة  والإلحاد  والخروج  على  الدين،  ليغرى  به  علماء  تونس  وفقهائها  كما  أغرى  به  السلطان.\n" +
                "قال  صاحب  دُرّة  الأسرار:\n" +
                "دخل  قاضى  الجماعة  ابن  البّراء  على  السلطان  أبى  زكريا  فقال:    إن  ها  هنا  رجلا  من  أهل  شاذلة  سُرّاق  الحمير  يدعى  الشرف،  وقد  اجتمع  عليه  خلق  كثير،  ويدعى  أنه  الفاطمى،  ويشوّش  عليك  فى  بلادك  ...\n" +
                "بيد  أن  السلطان  أبا  زكريا،  لم  يرد  أن  يتعجل،  وأراد  أن  يرى  قبل  أن  يحكم  وينفذ-  لأنه  كان  حكيما  عادلا-  فأمر  بأن  يعقد  مجلس  بحضرة  أبو  الحسن  والعلماء  والفقهاء،  وأن  يناقش  أبو  الحسن  فى  كل  هذه  الدعاوى  وغيرها،  ويعطى  الفرصة  للدفاع  عن  نفسه.\n" +
                "وعقد  المجلس  وحضره  السلطان،  وجلس  وراء  حجاب.\n" +
                "قال  صاحب  دُرّة  الأسرار:\n" +
                "اجتمع  ابن  البراء  وجماعة  من  الفقهاء  فى  القضية،  وجلس  السلطان  خلف  حجاب،  وحضر  الشيخ  رضي  الله  عنه،  وسألوه  عن  نسبه  مرارا،  والشيخ  يجيبهم  عليه،  والسلطان  يسمع،  وتحدثوا  معه  فى  العلوم  كلها  فأفاض  عليهم  بعلوم  أسكتهم  بها،  فما  استطاعوا  أن  يجاوبوه  عنها  من  العلوم  الموهوبة،  والشيخ  يتكلم  معهم  بالعلوم  المكتسبة  ويشاركهم  فيها.\n" +
                "وأفحم  ابن  البراء  وصحبه،  وعلت  كلمة  الشاذلى،  واقتنع  السلطان  ببراءته،  بل  آمن  بولايته،  فالتفت  إلى  ابن  البراء  ومن  معه  وقال  لهم:  \n" +
                "هذا  رجل  من  أكابر  الأولياء  وما  لكم  به  طاقة.\n" +
                "وأحسّ  ابن  البّراء  بحرج  الموقف،  فقد  كان  أهل  تونس  جميعاً  واقفين  بالباب،  ينتظرون  نتيجة  المحاكمة،  فأراد  أن  يعود  إلى  تحريض  السلطان  على  أبى  الحسن  وأن  يخيفه  من  ثورة  الناس  إن  هو  أطلق  سراحه،  فقال  له:\n" +
                "والله  لئن  خرج  فى  هذه  الساعة!  ليدخلَّن  عليك  أهل  تونس  ويخرجونك  من  بين  أظهرهم،  فإنهم  مجتمعون  على  بابك  !!!\n" +
                "ولكن  السلطان  لم  يعر  هذا  القول  التفاتا،  وأمر  الفقهاء  أن  ينصرفوا،  واستبقى  الشيخ  أبا  الحسن  ولبث  معه  وقتا  يحدثه  ويلاطفه،  إلى  أن  حضر  أخو  السلطان  أبوعبدالله  اللحيانى  -  وكان  من  المعتقدين  فى  الشيخ  -  فأمره  أن  يصحب  الشيخ  إلى  داره  معزَّزاً  مكرماً.\n" +
                "خرج  أبو  الحسن  من  هذه  المحنة  منتصرا،  ولكنه  بدأ  يحسُّ  أن  المقام  لم  يعد  يطيب  له  فى  تونس،  فإنه  توقع  أن  القاضى  ابن  البرَّاء  لا  يمكن  أن  يخضع  للهزيمة  التى  منى  بها،  وأنه  لابد  مدبرٌ  مكيدة  أخرى،  وأن  الفتنة  توشك  أن  تنشب  بين  أتباعه  وبين  الفقهاء  من  أصحاب  ابن  البرَّاء،  وهو  رجل  صوفى  ينشد  الصفاء  والهدوء  والحياة  الصافية،  لهذا  أزمع  على  مغادرة  تونس،  وأخذ  يدبِّر  الأمر  للرحلة.\n" +
                "وسمع  السلطان  بالخبر،  فتألم  وقال  لمن  حملوا  إليه  الخبر:\n" +
                "أي  شيء  يسمع  به  عن  إقليمنا؟!  أإنه  أتاه  ولىٌ  من  أولياء  الله  فضاق  عليه  حتى  خرج  فاراً  بنفسه  ..!!!  ...\n" +
                "ثم  أرسل  إلى  الشيخ  أبى  الحسن  من  يحاول  أن  يثنيه  عن  عزمه،  ولكن  الشيخ  اعتذر  اعتذاراً  لطيفاً  وقال  للرسول:    أنا  ما  خرجت  إلا  بنية  الحج،  وإذا  قضى  الله  حاجتى  أعود  إن  شاء  الله  تعالى  .\n" +
                "وعلى  أساس  هذا  الوعد  بالعودة  إلى  تونس  بعد  أداء  فريضة  الحج  سمح  السلطان  للشيخ  أبى  الحسن  بالسفر.\n" +
                "وقبل  أن  يغادر  الشاذلى  تونس  أرسل  إلى  ابن  البّراء  رسالة  قصيرة  بها  جملة  واحدة  يسخر  فيها  منه  ومن  أطماعه  وحقده،  قال  فيها:\n" +
                "أتراني  أوسع  لك  مدينة  تونس؟!\n" +
                "ولكن  ابن  البّراء  كان  قلبه  لا  يزال  عامرا  بالحقد  على  الشيخ  أبى  الحسن  منذ  منى  بالهزيمة  فى  مجلس  السلطان،  فدبّر  للشيخ  مكيدة  أخرى.\n");

        text4.setText("مع  سلطان  مصر\nلقد  أعد  رسالة  إلى  سلطان  مصر،  وقّع  عليها  معه  عدد  من  الشهود  وحدثه  فيها  حديث  الشيخ،  واتهمه  فيها  أيضاً  بأنه  شريف  علوى،  وأنه  يسعى  إلى  إعادة  ملك  الفاطميين،  وقال  فى  ختام  الرسالة:\n" +
                "إن  هذا  الواصل  إليكم  شوش  علينا  بلادنا  وكذلك  يفعل  ببلادكم،  وأمر  حامل  الرسالة  أن  يسرع  بها  ليصل  إلى  مصر  قبل  وصول  الشيخ  إليها.\n" +
                "وكان  سلطان  مصر  فى  ذلك  الوقت  هو  الملك  الكامل  محمد  الأيوبى،  والأيوبيون  سنيو  المذهب،  وهم  الذين  قضوا  على  المذهب  الشيعى  والدولة  الفاطمية  فى  مصر،  وكان  أخشى  ما  يخشونه  الحركات  الشيعية  التى  تعمل  لإعادة  الملك  للفاطميين  ...\n" +
                "لهذا  وجدت  هذه  الرسالة  عند  السلطان  أذنا  صاغية،  ولم  يكد  الشيخ  يصل  إلى  الإسكندرية  حتى  قبضت  عليه  السلطات  المصرية،  وأرسل  محروساً  إلى  القاهرة،  وعند  وصوله  إليها  صعد  به  إلى  القلعة  حيث  عقد  السلطان  مجلساً  من  القضاة  والعلماء  والفقهاء،  ووجه  السلطان  التهمة  إلى  الشيخ  أبى  الحسن  وقال  له:    هذا  عقد  مشهود  فيك،  وجهه  ابن  البّراء  من  تونس،  وعلامته  فيه    ...  ثم  أطلعه  على  العقد.\n" +
                "وكانت  محاكمة  ثانية  ...\n" +
                "وتحدث  الشيخ  فبهر  الجميع  بحديثه،  وأخذ  بألبابهم،  وخاصة  الملك  الكامل  فقد  كان  رجلا  عالما  مثقفا  واسع  الفكر  ....\n" +
                "فعرف  للشيخ  أبى  الحسن  مكانته،  وأدرك  أن  التهمة  مغرضة،  ولم  يجد  فى  الشيخ  شرا  يخافه،  وخاصة  أنه  لم  يكن  معتزما  المقام  فى  مصر،  بل  كان  متجهاً  فى  طريقه  إلى  الحج،  فقربه  إليه  وأكرمه،  يقول  الشيخ  أبو  الحسن:\n" +
                "  وأقمنا  عنده  –أى  عند  الملك  الكامل-  فى  القلعة  أياما،  واهتزت  لنا  الديار  المصرية  إلى  أن  طلعنا  للحج  \n" +
                "يقول  الدكتور  جمال  الشيال  فى  كتابه  (أعلام  الأسكندرية)  ص171:\n" +
                "  وفى  الحقيقة  أن  أبا  الحسن  لم  يكن  يُعْنى  بالسياسة  ولم  يكن  يفكر  فى  الملك،  بل  إنه  لم  يكن  يساير  غلاة  الشيعة  فى  معتقداتهم،  فالشيعة  لا  يؤمنون  إلا  بعلى،  وينكرون  خلافة  أبى  بكر  وعمر  وعثمان،  أما  أبو  الحسن  فقد  كان  يعترف  بهؤلاء  الصحابة  الأجلاء  وأنه  يغترف  من  فضلهم،  فقد  كان  يجيب  من  يسأله  عن  شيخه  بقوله:\n" +
                "  أما  فيما  مضى  فعبدالسلام  بن  مشيش،  وأما  الآن  فأنا  أستقى  من  عشرة  أبحر:  \n" +
                "خمسة  آدمية،  وخمسة  سماوية،  فالخمسة  الآدمية:  أبو  بكر  وعمر  وعثمان  وعلى  والنبي  صلي  الله  عليه  وسلم،  والخمسة  الروحانية:  جبريل  وميكائيل  وعزرائيل  وإسرافيل،  والروح    [لطائف  المنن].\n");

        text5.setText("أسرارُ  العودة  إلى  تونس\nبعد  أداء  فريضة  الحج  أسرع  الشيخ  أبو  الحسن  بالعودة  إلى  تونس!\n" +
                "ترى  هل  نسى  الشيخ  ما  فعله  به  ابن  البرَّاء  وكيف  سعى  به  لدى  سلطان  تونس  !  ..  ثم  لدى  سلطان  مصر؟\n" +
                "وابن  البرَّاء  كان  لا  يزال  حيَّا  يمارس  القضاء  فى  تونس  ...\n" +
                "إن  الشيخ  أبا  الحسن  لم  ينس  هذا  كله،  ولكنه  عاد  وفاءاً  بالوعد  الذى  وعده  للسلطان  أن  يذهب  للحج  ثم  يعود،  وعاد  لغرض  آخر  أهم  من  هذا  كله،  عاد  ليلتقى  بتلميذه  وصفيِّه  وخليفته  أبى  العبَّاس  المرسى،  فإنه  يروى  عن  أبى  الحسن  أنه  قال:\n" +
                "  ما  ردّنى  إلى  تونس  إلا  هذا  الشاب  ...\n" +
                "هذا  الشاب  الذي  لازمه  فلم  يفارقه  منذ  لقائه  به  !!!  إلى  أن  انتهت  بالشيخ  الحياة  فكان  الخليفة  من  بعده.\n" +
                "وكان  أبو  العبَّاس  قد  خرج  من  مدينة  مرسية  هو  وأبوه  وأمه  وأخوه  فى  سنة  640هـ  يقصدون  الحج،  وحملتهم  سفينة  عبر  البحر  الأبيض،  ولكن  السفينة  غرقت  بالقرب  من  بونة،  وقدر  لأبى  العباس  وأخيه  أن  ينجوا  من  الغرق،  فاتجها  إلى  تونس  وأقاما  بها  إلى  أن  عاد  إليها  أبو  الحسن  الشاذلى.\n" +
                "ذكر  ابن  عطاء  الله  فى  لطائف  المنن  قال:\n" +
                "  قال  الشيخ  أبو  العباس  رضي  الله  عنه:\n" +
                "لما  نزلت  بتونس  حين  أتيت  من  (مرسية)  وأنا  إذ  ذاك  شاب  فسمعت  بذكر  الشيخ  أبى  الحسن  الشاذلى  رضي  الله  عنه،  فقال  لى  رجل:  تمضى  بنا  إليه؟  ..قلت:  حتى  أستخير  الله،  فنمت  تلك  الليلة،  فرأيت  كأني  أصعد  إلى  رأس  جبل،  فلما  علوت  فوقه  رأيت  هنالك  رجلاً  عليه  برنس  أخضر  وهو  جالس،  وعن  يمينه  رجل،  وعن  يساره  رجل،  فنظرت  إليه  فقال  لي:  عثرت  على  خليفة  الزمان.\n" +
                "قال:  فانتبهت،  فلما  كان  بعد  صلاة  الصبح،  أتانى  الرجل  الذي  دعانى  إلى  زيارة  الشيخ  فسرت  معه،  فلما  دخلنا  على  الشيخ  رأيته  على  الصفة  التى  رأيته  فوق  الجبل،  قال:  فدهشت،  فقال  لي:  عثرت  على  خليفة  الزمان.  ما  اسمك؟  ..  فذكرت  له  اسمى  ونسبي.\n" +
                "فقال  لي:  رفعت  إلى  منذ  عشرة  أعوام  !!.\n" +
                "ثم  بايعه  ولقّنه  رضي  الله  عنه،  وربّاه  حتى  سلك،  ومن  ذلك  الوقت  مَلك،  ولم  ينقطع  عن  الشيخ  رضي  الله  عنه  طوال  حياته،  فقّربه  إليه،  وفاز  بإقباله  عليه،  وخصّه  بأسراره  العلية،  وكشف  له  عما  أعطاه  الله  من  المواهب  السنية.\n" +
                "لم  يمكث  الشيخ  بتونس  هذه  المرة  غير  سنتين،  عمل  خلالهما  على  تصفية  أموره،  فباع  داره  بها  ثم  أعد  العدة  للرحيل  إلى  الشرق.\n" +
                "وكان  يعلم  أن  مقامه  بتونس  مؤقتاً  بناء  على  ما  ذكره  له  شيخه  بقوله:    وبعد  ذلك  تنتقل  إلى  بلاد  الشرق  وترث  القطبانية  .\n" +
                "ولكنه  كان  مقيماً  ينتظر  الإذن  بالسفر،  وما  كان  له،  وقد  حضر  إلى  تونس  من  الحج،  واستقر  به  المقام  بها،  أن  يسافر  إلا  بإذن  ....\n" +
                "وأتى  له  الإذن:  يقول  رضي  الله  عنه:  رأيت  النبي  صلي  الله  عليه  وسلم  فى  المنام  فقال  لي:\n" +
                "  يا  على  انتقل  إلى  الديار  المصرية  تربي  فيها  أربعين  صديقا  .\n" +
                "وكان  ذلك  فى  زمن  الصيف  وشدة  الحر،  فقلت:\n" +
                "  يا  سيدي  يا  رسول  الله  الحر  شديد،  فقال  لي:  الغمام  يظلكم،  فقلت:  يا  حبيبي  أخاف  العطش،  فقال  لي:  إن  السماء  تمطركم  كل  يوم  أمامكم،  قال:  ووعدنى  فى  طريقى  بسبعين  كرامة.\n" +
                "فأمر  الشيخ  أصحابه  بالسفر  ...\n" +
                "وكان  فى  صحبته  عند  رحيله  عدد  كبير  من  تلاميذه  ومريديه  الذين  آثروا  صحبته  على  البقاء  فى  أوطانهم.\n" +
                "وكان  فى  مقدمتهم  تلميذه  الأثير  أبو  العباس  المرسي،  وخادمه  الأمين  أبو  العزائم  ماضى  بن  سلطان،  والحاج  محمد  القرطبى،  وأبو  عبدالله  البجائى،  وأبو  الحسن  البجائى،  والخراز  وغيرهم  كثيرون،  وكان  الركب  وهو  فى  طريقه  إلى  الإسكندرية  يتزايد  عدده  كلما  مر  بمدينة  من  المدن،  فينضم  إليه  الأتباع  والمريدون  يؤثرون  الرحلة  مع  الشيخ  على  البقاء  فى  أوطانهم.\n");
    }
}
