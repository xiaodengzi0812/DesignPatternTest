package com.stage.designpatterntest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * @author Djk
 * @Title: 设计模式介绍
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */
public class IntroduceUtil {
    public static final String ABSTRACT_FACTORY = "http://note.youdao.com/noteshare?id=2d31ce64104d67438f5aadbeeb1a2168&sub=C16241F5B2484691BED1960F9CAC57E9";
    public static final String FACTORY = "http://note.youdao.com/noteshare?id=bd2eb9892172bf31f0e13b17c0d46188&sub=6C477165A97541E7A73A558434BCBD82";
    public static final String OBSERVER = "http://note.youdao.com/noteshare?id=0b5e7ce9dea00e46d2d3110aebfe490d&sub=1C764F2CD00A4C0994461EDA4146B254";
    public static final String SINGLE = "http://note.youdao.com/noteshare?id=7b103cf9b24d608b10f2b3b8f0bebb40&sub=A8317312F79E4F578800271AD83D6C5B";
    public static final String BRIDGE = "http://note.youdao.com/noteshare?id=f36ad51ece4b03a55dada173059e50ef&sub=6CA6293752AC4FD7945C355732D71913";
    public static final String ADAPTER = "http://note.youdao.com/noteshare?id=cfe34d97bf29a913a9a2614394eb7e33&sub=9FB1D62992244337A83A6FB723B93405";
    public static final String FACADE = "http://note.youdao.com/noteshare?id=5c44ca513ff99f7c36c12d0d93da3f02&sub=F692510CDFAF4F46A8729292F18E0F5B";
    public static final String RESPONSIBILITY = "http://note.youdao.com/noteshare?id=3395fa0ad292400ef45fb7d0e1ca3184&sub=BD89A2799B0F4A22AF92B141D0CC08EF";
    public static final String VISITOR = "http://note.youdao.com/noteshare?id=065614f64bb20a848f3f96e04e5fa73c&sub=13B91689172F419AB3F62D8C0CE7B092";
    public static final String STRATEGY = "http://note.youdao.com/noteshare?id=9004e38321b9e69e187cb3ef6709ebc1&sub=E0748FF359784FE5B56FEE5A500CFCD1";
    public static final String TEMPLATE = "http://note.youdao.com/noteshare?id=9976bbcb348af2c3a319242415a07df6&sub=CBDB0D33A12F41C4850ECF985F0AD2A3";
    public static final String MEMENTOR = "http://note.youdao.com/noteshare?id=4bfe439cb2240621b9f2ab300dd00c1d&sub=9D9DECF8251240DC90AEE1DAC76E3668";
    public static final String ITERATOR = "http://note.youdao.com/noteshare?id=c4abec5812fa6f9894db92d259d276ca&sub=538A3F04B1DA4CA0819875F623E839C5";
    public static final String DECORATOR = "http://note.youdao.com/noteshare?id=b7d9414365ee78a8a3e2fabd9cc4e38e&sub=1CC008D6847A4694A121F56CFD058E63";
    public static final String BUILDER = "http://note.youdao.com/noteshare?id=3c4769ea2f45f6f6f44451627b47c59b&sub=BAAD80ED023B444EBA66915F40A8E3D0";
    public static final String COMMAND = "http://note.youdao.com/noteshare?id=6c105269a6271d88b439c73cd47fc855&sub=F2B9369D4F004405BE07DE04E2AB9755";
    public static final String PROXY = "http://note.youdao.com/noteshare?id=c61e25072120648ee1f17d67ac3fb59e&sub=FC613488CB9E445D8685FD8B5D569FDC";

    public static final String DESIGN = "http://note.youdao.com/noteshare?id=9d843fee8bb688b17df9d224b896b068&sub=6A977D10E1D64322B30BE945E027B2DE";

    public static void doIntroduce(Context context, String url) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri content_url = Uri.parse(url);
        intent.setData(content_url);
        context.startActivity(intent);
    }

}
