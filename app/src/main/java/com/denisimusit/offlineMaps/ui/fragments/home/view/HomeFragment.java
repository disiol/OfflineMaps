package com.denisimusit.offlineMaps.ui.fragments.home.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.databinding.FragmentHomeBinding;
import com.denisimusit.offlineMaps.ui.base.BaseBindingToolbarFragment;
import com.denisimusit.offlineMaps.ui.fragments.home.presenter.HomePresenter;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;
import java.util.List;

import static com.denisimusit.offlineMaps.constants.Constants.LOG_TAG;

public class HomeFragment extends BaseBindingToolbarFragment<HomePresenter, FragmentHomeBinding> implements HomeView {

    private List regionsList = new ArrayList();


    @Override
    public String getTitle() {
        return getString(R.string.home_fragment_title);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        presenter.getFreeSpace(binding.freeSpaceTextView);
//        getNameMaps();
        startDownloadMap();
    }

    @Override
    public void startDownloadMap() {
        presenter.downloadMap("denmark_capital-region");
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable throwable) {

    }

    public List getNameMaps() {
        String tmp = "";

        try {
            XmlPullParser pullParser = getResources().getXml(R.xml.regions);

            while (pullParser.getEventType() != XmlPullParser.END_DOCUMENT) {
                switch (pullParser.getEventType()) {
                    // начало документа
                    case XmlPullParser.START_DOCUMENT:
                        Log.d(LOG_TAG, "START_DOCUMENT");
                        break;
                    // начало тэга
                    case XmlPullParser.START_TAG:
                        Log.d(LOG_TAG, "START_TAG: name = " + pullParser.getName()
                                + ", depth = " + pullParser.getDepth() + ", attrCount = "
                                + pullParser.getAttributeCount());
                        tmp = "";
                        for (int i = 0; i < pullParser.getAttributeCount(); i++) {
                            tmp = tmp + pullParser.getAttributeName(i) + " = "
                                    + pullParser.getAttributeValue(i) + ", ";
                        }
                        if (!TextUtils.isEmpty(tmp))
                            Log.d(LOG_TAG, "Attributes: " + tmp);
                        break;
                    // конец тэга
                    case XmlPullParser.END_TAG:
                        Log.d(LOG_TAG, "END_TAG: name = " + pullParser.getName());
                        break;
                    // содержимое тэга
                    case XmlPullParser.TEXT:
                        Log.d(LOG_TAG, "text = " + pullParser.getText());
                        break;

                    default:
                        break;
                }
                // следующий элемент
                pullParser.next();
            }
            Log.d(LOG_TAG, "END_DOCUMENT");

            return regionsList;
        } catch (Throwable t) {

            Log.e(LOG_TAG, "Ошибка при загрузке XML-документа: " + t.toString());
            Toast.makeText(getActivity(),
                    "Ошибка при загрузке XML-документа: " + t.toString() + " "+
                            t.getCause() + " "+
                            t.getMessage(), Toast.LENGTH_LONG)
                    .show();

            t.printStackTrace();
        }
        return null;
    }


}



