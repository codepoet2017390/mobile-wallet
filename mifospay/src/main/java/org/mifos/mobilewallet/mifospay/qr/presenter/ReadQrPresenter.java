package org.mifos.mobilewallet.mifospay.qr.presenter;

import org.mifos.mobilewallet.core.base.UseCaseHandler;
import org.mifos.mobilewallet.mifospay.base.BaseView;
import org.mifos.mobilewallet.mifospay.qr.QrContract;

import javax.inject.Inject;

/**
 * ReadQr Presenter
 * @author naman
 * @since 8/7/17
 */

public class ReadQrPresenter implements QrContract.ReadQrPresenter {

    private final UseCaseHandler mUsecaseHandler;
    private QrContract.ReadQrView mReadQrView;



    @Inject
    public ReadQrPresenter(UseCaseHandler useCaseHandler) {
        this.mUsecaseHandler = useCaseHandler;
    }

    //method to attach view to the presenter
    @Override
    public void attachView(BaseView baseView) {
        this.mReadQrView = (QrContract.ReadQrView) baseView;
        mReadQrView.setPresenter(this);

    }

}

