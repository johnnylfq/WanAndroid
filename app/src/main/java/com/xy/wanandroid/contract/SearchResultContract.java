package com.xy.wanandroid.contract;

import com.xy.wanandroid.base.presenter.AbsPresenter;
import com.xy.wanandroid.base.view.AbstractView;
import com.xy.wanandroid.data.main.SearchResult;

import java.util.List;

/**
 * Created by jxy on 2018/6/21.
 */

public class SearchResultContract {

    public interface View extends AbstractView {

        void getSearchResultOk(SearchResult searchResult, boolean isRefresh);

        void getSearchResultErr(String info);

    }

    public interface Presenter extends AbsPresenter<SearchResultContract.View> {

        void autoRefresh(String key);

        void loadMore(String key);

        void getSearchResult(int page, String key);

    }
}
