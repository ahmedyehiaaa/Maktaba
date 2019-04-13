package com.example.ahmedyehia.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class firstbook10 extends AppCompatActivity {

    TextView text1,text2;
    Typeface myfont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstbook10);

        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/me_quran_volt_newmet.ttf");
        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text1.setTypeface(myfont);
        text2.setTypeface(myfont);

        text1.setText("فى  الإسكندرية\nيقول  صاحب  (درة  الأسرار)  ص40:\n" +
                "  وكان  ممن  صحبه  –  أى  الشيخ  أبا  الحسن  الشاذلى-  فى  سفره  الولى  الصالح  أبو  على  بن  السماط،  فلما  وصلنا  إلى  مدينة  طرابلس،  قال  الشيخ:\n" +
                "نتوجه  على  الطريق  الوسطى،  واختار  الشيخ  أبو  على  طريق  الساحل.\n" +
                "قال:  فرأى  الشيخ  رسول  الله  صلي  الله  عليه  وسلم  فقال  له:  يا  أبا  على،  أنت  ولى  الله،  وأبو  الحسن  ولى  الله،  ولن  يجعل  الله  لولى  على  ولى  سبيلا،  امش  على  طريقك  التى  اخترت،  وهو  على  طريقه  الذي  اختار.\n" +
                "قال:  فافترقا  إلى  أن  اجتمعنا  بمقربة  الإسكندرية،  قال:  فلما  صلينا  الصبح،  توجه  الشيخ  أبو  على  إلى  خباء  الشيخ  أبى  الحسن،  ونحن  صحبته،  فدخل  عليه،  وجلس  بين  يديه،  وتأدب  معه  أدبا  ما  اعتاده  منه،  وتحدث  معه  بكلام  ما  فهمنا  منه  كلمة.\n" +
                "فلما  أراد  الانصراف  قال  له:  يا  سيدي،  هات  يدك  أقبلها،  فقبل  يده  وانصرف  وهو  يبكى،  قال  فتعجبنا  من  حاله  معه،.\n" +
                "فلما  كان  فى  أثناء  الطريق  التفت  لأصحابه  وقال:\n" +
                "  رأيت  البارحة  رسول  الله  صلي  الله  عليه  وسلم،  وقال  لي:  يا  يونس،  كان  الشيخ  أبو  الحجاج  الأقصرى  بالديار  المصرية،  وكان  قطب  الزمان،  فمات  البارحة،  وأخلفه  الله  بأبى  الحسن  الشاذلى،  قال:  فأتيته  حتى  بايعته  بيعة  القطابة.\n" +
                "وقد  وصل  الشيخ  أبو  الحسن  وركبه  وصحبه  إلى  الاسكندرية،  ودخلوها  من  جهة  عمود  السوارى  من  ظاهرها،  وكان  وصولهم  إليها  عند  اصفرار  الشمس.\n" +
                "واتخذ  الشيخ  له  دارا  يقيم  فيها  بالقرب  من  كوم  الديماس  –كوم  الدكة  الحالى-  ومما  يدل  على  شدة  ورعه  رضي  الله  عنه  ما  ذكره  ابن  عطاء  الله  فى  (لطائف  المنن)  حيث  قال:\n" +
                "  وقال  الشيخ  أبو  العباس  رضي  الله  عنه:  لما  قدمنا  من  المغرب  إلى  الإسكندرية  نزلنا  عند  عمود  السوارى  من  ظاهرها،  وكان  وصولنا  عند  اصفرار  الشمس،  وكانت  بنا  فاقة  وجوع  شديد،  فبعث  لنا  رجل  من  عدول  الإسكندرية  طعاماً،  فلما  قيل  للشيخ  عنه،  قال:  لا  يأكل  أحد  منه  شيئاً،  فبتنا  على  ما  نحن  عليه  من  الجوع،  فلما  كان  عند  الصبح  صلى  بنا  الشيخ  وقال:  مدّوا  السماط  وأحضروا  ذلك  الطعام،  ففعلنا  وتقدمنا  فأكلنا.\n" +
                "فقال  الشيخ  رضي  الله  عنه:  رأيت  فى  المنام  قائلا  يقول  لي:  أحل  الحلال  ما  لم  يخطر  لك  على  بال،  ولا  سألت  فيه  أحدا  من  النساء  والرجال  .\n" +
                "والمعنى  من  ذلك  أنه  لم  يعرف  الرجل  فتورع  عن  الأكل،  حتى  أتاه  البيان  بأن  هذا  رزق  ساقه  الله  لهم  من  غير  مسألة  وهو  أحل  الحلال. \n" +
                "وقال  الشيخ  أبو  الحسن  رضي  الله  عنه:  لما  قدمت  الديار  المصرية  قيل  لي:  يا  على  ذهبت  أيام  المحن  وأقبلت  أيام  المنن  عشرا  بعشر  إقتداء  بجدك  صلي  الله  عليه  وسلم.\n" +
                "أما  سكنه  الذي  انتقل  إليه  بعد  ذلك  فى  الاسكندرية،  فكان  فى  برج  من  أبراج  السور،  خصصه  له  السلطان،  وكان  وقتئذ  الملك  الصالح  نجم  الدين  أيوب،  وحبسه  عليه  وعلى  ذريته،  فى  أسفله  مرابط  للبهائم،  وفى  الوسطى  منه  مساكن  للفقراء  وجامع  كبير،  وفى  أعلاه  مسكنه.\n" +
                "وبدأ  الشيخ  يلقى  دروسه  ويدعو  الناس  إلى  طريقته  فى  مسجد  العطارين،  كما  كان  يعقد  كل  ليله  فى  داره  مجلساً  يأتى  الناس  إليه  من  البلد  يسمعون  كلامه.\n" +
                "وقد  جذبت  إليه  هذه  الدروس  والمواعظ  الجلّة  من  علماء  المدينة  وفقهائها  وفضلائها  فلازموها  ملازمة  تامة.\n" +
                "وكان  هؤلاء  التلاميذ  فيما  بعد  قادة  الحياة  الفكرية  والروحية  فى  المدينة،  نذكر  منهم  تلميذه  الأثير  أبا  العباس  المرسى،  والشيخ  مكين  الدين  الأسمر،  والشيخ  عبدالحكيم  بن  أبى  الحوافر،  والشيخ  أبا  القاسم  القبارى،  والشيخ  أمين  الدين  جبريل،  والشيخ  ابن  المنير،  والشيخ  شرف  الدين  البونى،  وكثيرين  غيرهم.\n" +
                "وفى  هذا  الجامع  قدم  الشيخ  أبو  العباس  وأعلن  خلافته  له،  وأذن  له  فى  إلقاء  الدروس  على  تلاميذه  وطلابه،  وأن  يفقههم  فى  دينهم،  ويعلمهم  مبادئ  الشريعة  وسبل  الحقيقة،  ويرشدهم  إلى  الله  تعالى.\n" +
                "يقول  صاحب  (درة  الأسرار):\n" +
                "  وتزوج  هناك،  وولد  له  أولاد،  منهم:  الشيخ  شهاب  الدين  أحمد،  وأبو  الحسن  على،  وأبو  عبدالله  محمد  شرف  الدين،  ومن  البنات:  زينب،  وعريفة  الخير  \n" +
                "ثم  أكثر  بعد  ذلك  الشيخ  من  الترحّل  بالبلاد،  والتنقل  فى  داخل  الديار  المصرية،  مبشراً  بمبادئه،  ناشراً  علومه  ومعارفه.  وكثيراً  ما  كان  يلازمه  الشيخ  أبو  العباس  فى  رحلاته،  أو  يلحق  به  فى  إقامته  ثم  يعودان  إلى  الإسكندرية؛  وكانت  دروس  الشيخ  أبى  الحسن  بمسجد  المقياس  بالروضة،  وبالمدرسة  الكاملية  بالقاهرة.\n" +
                "يقول  د.  عبدالحليم  محمود  فى  كتابه  (أبو  الحسن  الشاذلى)  ص42:\n" +
                "  ولقد  كانت  مصر  حينئذ  تعتز  بمجموعة  من  أكرم  العلماء  وأفضلهم  علما  وخلقا  وصلاحا،  مجموعة  وهبت  نفسها  لله  وأسلمت  قيادها  له،  فأحاطها  الله  بعنايته،  وتكفلها  برعايته،  ووضع  حبها  فى  قلوب  الناس،  ووضع  مهابتها  فى  أفئدتهم،  فكانت  محبوبة  مهيبة.\n" +
                "ولقد  استقبلت  هذه  المجموعة  أبا  الحسن  أجمل  استقبال  وأحسنه  ورافقته  متتلمذة  ومتآخية  \n" +
                "ويقول  صاحب  (المفاخر  العلية)  ص15:\n" +
                "  إن  الشيخ  رضي  الله  عنه،  لما  قدم  من  المغرب  الأقصى  إلى  مصر،  صار  يدعو  الخلق  إلى  الله  تعالى،  فتصاغر  وخضع  لدعوته  أهل  المشرق  والمغرب  قاطبة.\n" +
                "وكان  يحضر  مجلسه  أكابر  العلماء  من  أهل  عصره  مثل  سيدي  الشيخ  عز  الدين  بن  عبدالسلام،  والشيخ  تقى  الدين  بن  دقيق  العيد،  والشيخ  عبدالعظيم  المنذرى،  وابن  الصلاح،  وابن  الحاجب،  والشيخ  جمال  الدين  عصفور،  والشيخ  نبيه  الدين  بن  عوف،  وهؤلاء  سلاطين  علماء  الدين  شرقا  وغربا  فى  عصرهم،  وأيضاً  الشيح  محيى  الدين  بن  سراقة،  والعلم  ياسين  تلميذ  ابن  العربي  رضي  الله  عنهم،  فكانوا  يحضرون  ميعاده  بالمدرسة  الكاملية  بالقاهرة  لازمين  الأدب،  مصغيين  له،  متتلمذين  بين  يديه.\n" +
                "وهكذا  كان  درس  الشيخ  مظهراً  من  مظاهر  العظمة  والجلال،  فكانت  مجالسه  لا  تزال  غاصة  بأكابر  العلماء،  وفطاحل  الفقهاء،  حافلة  بعظماء  الأمة  وأكابرها.\n" +
                "وكان  الشيخ  الإمام  قاضى  القضاة  بدر  الدين  بن  جماعة  الولى  ابن  الولى  ابن  الولى  رحمهم  الله  كان  يرى  أنه  فى  بركة  الشيخ  أبى  الحسن  فى  مصر،  وكان  يفتخر  بصحبته،  وبحضور  جنازته  والصلاة  عليه  بحميثرة  \n" +
                "ولما  أتى  الشيخ  من  الحج  قابله  أمير  العلماء  العز  بن  عبدالسلام  فى  موضع  يقال  له  البركة  يبعد  عن  القاهرة  بستة  أميال.    تعظيما  له  وإجلالاً.\n" +
                "وقد  قال  رضي  الله  عنه  فى  مجلسه  كما  ذكر  صاحب  (درة  الأسرار)  ص186:\n" +
                "  رأيت  رسول  الله  صلي  الله  عليه  وسلم  فى  المنام،  فقال  لى:  يا  على  ما  فى  زمانك  مجلس  فى  علم  الفقه  أبهى  من  مجلس  عز  الدين  بن  عبدالسلام،  ولا  فى  الحديث  أبهى  من  مجلس  زين  الدين  بن  عبدالعظيم،  ولا  فى  علم  الحقيقة  من  مجلسك  \n" +
                "أما  عن  معيشته  فى  الديار  المصرية  فإنه  يصفها  فى  إحدى  رسائله  إلى  بعض  أصدقائه  بتونس،  وهى  رسالة  طويلة  يقول  فيها  رضوان  الله  عليه:  \n" +
                "  الكتاب  إليكم  من  الثغر  (يعنى  الإسكندرية)  حرسه  الله،  ونحن  فى  سوابغ  نعم  الله  نتقلب،  وهو  بفضله  وبوده  إلينا  يتحبب،  قد  ألقى  علينا  وعلى  أحبابنا  كنفه،  وجعلنا  عنده  ...  فما  ألطفه!،  ندعوه  فيلبينا،  وبالعطاء  قبل  السؤال  ينادينا،  فلله  الحمد  كثيرا  كما  ينبغى  لوجهه  الكريم  وجلاله  العظيم.\n" +
                "وأ  ما  الأهل  والأولاد  والأصهار  والأحباب  ففى  سوابغ  نعم  الله  يتقلبون،  وبإحسانه  ظاهراً  وباطناً  مغمورون  نسأل  الله  المزيد  التام  العام  لكم  ولهم  أجمعين،  وأن  ينوب  عنا  فى  شكره،  إنه  أكرم  الأكرمين  \n" +
                "وهكذا  كانت  إقامة  الشيخ  بمصر  فترة  استقرار  مادى  ومعنوى،  وكانت  فترة  خصبة  من  حيث  الدعوة  ....\n" +
                "ومن  حيث  تربية  الرجال.\n");
        text2.setText("لقاء  الله\nظل  الشاذلى  بمصر  قرابة  أربعة  عشر  عاما  من  عام  642هـ  إلى  أن  توفى  سنة  656هـ  يدعو  إلى  الله  عز  وجل  ...\n" +
                "وكان  رضي  الله  عنه  يكثر  من  زيارة  البيت  الحرام،  فلما  كان  شهر  شوال  سنة  656هـ  أخذ  الشيخ  فى  السفر  إلى  الأراضى  المقدسة  للحج،  وكان  قبل  ذلك  يقول:\n" +
                "    قيل  لى  يا  علىّ  ستدفن  فى  أرض  ما  عُصيت  عليها  قط  \n" +
                "فلما  تجهز  للسفر  قال  لخادمه  ماضى:\n" +
                "  احملوا  معكم  فأساً  وقفة  وحنوطا    قال:    ولم  يكن  له  بذلك  عادة  متقدمة  فى  جميع  ما  سافرت  معه    فسُئل  فى  ذلك،  فقال:    إذا  مات  منا  أحد  واريناه  التراب  ،  وروي  أنه  قال:    فى  حميثرا  سوف  ترى  .\n" +
                "فلما  كان  فى  حميثرة  بصحراء  عيذاب،  وهى  بين  قنا  والقصير،  جمع  الشيخ  أصحابه  فى  إحدى  الأمسيات،  وأوصاهم  بأشياء،  وأوصاهم  بحزب  البحر،  وقال  لهم:\n" +
                "  حفّظوه  لأولادكم  فإن  فيه  اسم  الله  الأعظم  \n" +
                "ثم  خلا  بأبى  العباس  رضى  الله  عنهما،  وحده،  وأوصاه  بأشياء،    واختصه  بما  خصه  الله  به  من  البركات  \n" +
                "ثم  وجه  الحديث  لأصحابه  قائلاً:\n" +
                "  إذا  أنا  متَّ  فعليكم  بأبى  العباس  المرسى:  فإنه  الخليفة  من  بعدي،  وسيكون  له  بينكم  مقام  عظيم،  وهو  باب  من  أبواب  الله  سبحانه  وتعالى  \n" +
                "يقول  صاحب  (درة  الأسرار)  عن  الشيخ  الصالح  شرف  الدين  ولد  الشيخ  ياقوت  قال:\n" +
                "  فلما  كان  بين  العشاءين  قال:  يا  محمد،املأ  لى  إناءاً  بالماء  من  هذه  البئر،  فقلت  له  يا  سيدي،  ماؤها  مالح  زاعق،  والماء  عندنا  عذب،  فقال  لى:\n" +
                "ائتنى  منها  فإن  مرادى  غير  ما  أنت  تظن!،  قال:  فأتيته  بإناء  مملوءاً  بالماء،  فشرب  منه،  ومضمض  فاه  ومجّه  فى  الإناء،  ثم  قال  لى:  ردَّه  إليها،  (أى  إلى  البئر)  فرددته  إليها،  فحلا  ماء  البئر  وعذب،  وكثر  بإذن  الله  تعالى.\n" +
                "وبات  تلك  الليلة  متوجها  إلى  الله  تعالى  ذاكراً  يسمعه  أصحابه  وهو  يقول:    إلهى،  إلهى  \n" +
                "  فلما  كان  السحر  سكن،  فظننا  أنه  نام،  فحركناه  فوجدناه  ميتا  .\n" +
                "وجاء  الشيخ  أبو  العباس  فغسله،  وصلى  الجميع  عليه،  ودفن  حيث  توفاه  الله  رضى  الله  تعالى  عنه  وأرضاه.\n" +
                "يقول  د.  عبدالحليم  محمود  فى  كتابه  (أبو  الحسن  الشاذلى)  ص44:\n" +
                "  وقد  كان  للشيخ  أولاد  ذكور  فلم  يفكر  فى  أن  يستخلف  أحدهم،  إنما  استخلف  من  رآه  أحق  بالخلافة،  ونرجو  أن  يعتبر  به  رجال  الطرق  فى  العصر  الراهن  فلا  يجعلوا  الطريقة  مورد  رزق  تورث  كما  يورث  العقار  .\n" +
                "قال  صاحب  (درة  الأسرار):  عن  ولد  الشيخ  ياقوت  (محمد  شرف  الدين):\n" +
                "    فلما  دفناه  رحمه  الله  تعالى،  اختلف  أصحابه  فى  الرجوع  أو  التوجه،  فقال  لهم  سيدى  أبو  العباس  المرسى:  الشيخ  أمرني  بالحج،  ووعدنى  بكرامات،  فتوجهنا  فرأينا  تهوينا  وبركات،  ورجعنا  صحبته،  وظهر  من  بعده  وله  ظهور  عظيم.\n" +
                "وقال  عن  الشيخ  أبو  الحسن  رضي  الله  عنه:\n" +
                "    لما  مرضت  قلت:  إلهى  متى  يكون  اللقاء؟  فقيل  لى:  يا  على  إذا  وصلت  إلى  حميثرة  فحينئذ  يكون  اللقاء.  وقد  رأيت  كأنى  أدفن  إلى  ذيل  جبل  بإزائه  بئر  قليلة  الماء  مالحة  فوقع  فى  نفسي  شيء،  فخوطبت  فى  سري:  يا  على  ماؤها  يكثر  ويعذب  .\n" +
                "وحدث  صاحب  (المفاخر  العلية)  أن  القاضى  أبو  اسحاق  عبدالرفيع  قال:  لما  توجه  الشيخ  أبو  الحسن  الشاذلى  رضي  الله  عنه  لسفرته  التى  توفى  فيها،  قال:\n" +
                "    فى  هذا  العام  أحج  حج  نيابة،  فمات  رحمه  الله  قبل  أن  يحج  فلما  رجعوا  إلى  القاهرة  سألوا  المفتى  عز  الدين  بن  عبدالسلام  وأخبروه  بمقالة  الشيخ  فبكى  وقال  لهم:  الشيخ  والله  أخبركم  أنه  يموت  وما  عندكم  به  علم،  قد  أخبركم  أن  الملك  هو  الذي  يحج  نيابة  عنه،  لأنه  جاء  فى  الحديث  عن  النبي  صلي  الله  عليه  وسلم  أنه  قال:  {من  خرج  من  بيته  قاصداً  للحج  ومات  قبل  أن  يحج  فإن  الله  عز  وجل  يوكل  ملكاً  ينوب  عنه  بالحج  فى  كل  عام  إلى  يوم  القيامة}.  \n" +
                "قال:  وحدثنى  عماد  الدين  قاضى  القضاة  بالإسكندرية  قال:\n" +
                "  كانت  عندنا  بالإسكندرية  امرأة  مسرفة  على  نفسها  فرُؤيت  فى  حالة  حسنة،  فقيل  لها:  ما  فعل  الله  بك؟  قالت:  مات  الشيخ  أبو  الحسن  الشاذلى  ودفن  بحميثرة،  فغفر  الله  لكل  من  دُفن  من  المسلمين  فى  مشارق  الأرض  ومغاربها  من  أجله،  فكنت  أنا  ممن  غفر  الله  لى  بحرمة  الشيخ  إكراماً  له.\n" +
                "وكان  ذلك  أثناء  سفره،  فلما  قدم  الحجاج  أخبروا  بوفاته  فوجدوا  التاريخ  صحيحاً.\n" +
                "وكانت  وفاته  رضي  الله  عنه  فى  شهر  شوال  عام  ستة  وخمسين  وستمائة،  وكان  عمره  رضي  الله  عنه  ثلاثا  وستين  سنة.\n" +
                "وروى  ابن  عطاء  الله  فى  لطائف  المنن  ص81  قال:    قال  الشيخ  أبو  العباس  المرسى  رضي  الله  عنه:  \n" +
                "سافرنا  مع  الشيخ  رضي  الله  عنه  فى  السنة  التى  توفى  فيها،  فلما  كنا  عند  أخميم  قال  لى  الشيخ:\n" +
                "رأيت  البارحة  كأنى  فى  جلبة  وأنا  فى  البحر،  والرياح  قد  اختلفت،  والأمواج  قد  تلاطمت،  والمركب  قد  انفتح،  وأشرفنا  على  الغرق،  فأتيت  إلى  جانب  المركب،  وقلت:  أيها  البحر،  إن  كنت  أمرت  بالسمع  والطاعة  لى  فالمنّة  لله  السميع  العليم،  وإن  كنت  أمرت  بغير  ذلك  فالحكم  لله  العزيز  الحكيم،  فسمعت  البحر  يقول:  الطاعة  الطاعة.\n" +
                "فلما  سافرنا،  وتوفى  الشيخ  رضي  الله  عنه  ودفنّاه  بحميثرة  من  صحراء  عيذاب  وكنا  فى  جلبة،  فلما  صرنا  وسط  البحر،  اختلفت  الأمواج،  وتلاطمت  الرياح،  وانفتح  المركب،  وأشرفنا  على  الغرق،  ونسيت  كلام  الشيخ،  فلما  اشتد  الأمر  ذكرت  ذلك  فأتيت  إلى  جانب  المركب  وقلت:  أيها  البحر  إن  كنت  أمرت  بالسمع  والطاعة  لأولياء  الله  فالمنّة  لله  السميع  العليم،  ما  قلت  كما  قال  الشيخ  بالسمع  والطاعة  لى،  وإن  كنت  أمرت  بغير  ذلك  فالحكم  لله  العزيز  الحكيم،  ...  فسمعت  البحر  يقول:  الطاعة  الطاعة،  وسكن  البحر  وطاب  السفر.\n" +
                "وروى  عن  أبى  العباس  المرسى:\n" +
                "أن  الشيخ  أبا  الحسن  لم  يمرض  ولكن  وعك  يوما  وانحرف  مزاجه  فطلب  ماء  للوضوء  ودخل  فى  الصلاة  ثم  قبض  فى  السجدة  \n" +
                "وقد  أجاد  سيدي  على  وفا  قدّس  الله  سره  حيث  قال  فى  هذا  الإمام:\n" +
                "يا  سيّـدي  يا  عليّ  عُليت  يــا  أملي\n" +
                "\t\tعن  أن  ينال  حسود  بعض  ما  نلتا\n" +
                "أنت  الذي  إن  نقل  من  هو  إمـام  هدى\n" +
                "\t\tأهل  النّهى  اليوم  قالوا  كلهم  أنتا\n" +
                "يا  من  أقام  بنـــــور  الله  منهجه\n" +
                "\t\tفلا  ترى  فيه  عوجا  ولا  أمْتا\n" +
                "لا  شك  أنت  لنا  نور  نســـير  بـه\n" +
                "\t\tوأنت  بدر  ينير  الحين  والوقْتا\n" +
                "وأنت  فى  الكون  ســرّ  الله  أظـهره\n" +
                "\t\tوأنت  شمس  سمت  فى  المستوى  سْمتا\n" +
                "وافيتنا  بمـــعاني  الجود  مبتــدئا\n" +
                "\t\tبغاية  الفضل  سكْبا  لا  ترى  سكْتا\n" +
                "بالوارث  الحـــامد  المحمود  منفردا\n" +
                "\t\tبمستقر  مقام  الحمد  قد  قُمْتا\n" +
                "والله  إن  كنوز  الأرض  طــوع  يَدَىْ\n" +
                "\t\tمن  قد  أحبك  حقا  أينما  كُنْتا\n" +
                "الله  يرضى  إذا  ترضى    ويغضـب    إن\n" +
                "\t\tتغضب،  وعنه  بدا  ما  عنك  أظهرتا\n" +
                "إنا  لنشهد  فعل  الله    عنـــدك  إن\n" +
                "\t\tتفعل  ونسمع  قول  الله  إن  قُلْتا\n");
    }
}
