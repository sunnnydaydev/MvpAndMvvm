package com.example.administrator.mvpdemo.presenter;


        import com.example.administrator.mvpdemo.view.OtherView;

/**
 * Create by SunnyDay on 2019/04/24
 */
public interface OtherPresenter extends BasePresenter<OtherView> {

    void attachView(OtherView otherView);

    void upLoadImage(String url);//上传图片
}
