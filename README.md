# kotlin-spring-sample

## KotlinのSpring Boot実装

1. [Spring Initializer](https://start.spring.io/)でベースプロジェクトを作成できる
2. @SpringBootApplicationがエントリーポイント
    1. コマンドで実行する
   ```
    ./gradlew bootRun
   ```
3. @Controller
    1. 「resources/templates/」下のHTMLファイルをreturn
    2. Thymeleafのテンプレートエンジンで埋め込みが
4. @RestController
    1. Responseのクラスを定義をしておき、戻り値の型とすることでJSON応答
5. @RequestMapping
    1. classのパスとして指定できる
    2. class単位でパスを分けたいときに使用
6. @GetMapping, @PostMapping, etc...
    1. "/path1/path2"として指定することでエンドポイントを作成できる
    2. @PathVariableでパスパラメータを取得
    3. @RequestParamでGET,POSTなどのパラメータを取得
    4. @RequestBodyでPOSTのJSONリクエストパラメータを取得
    4. 正規表現での指定も可能
        1. メソッドパスパラメータによってメソッドを分けたいときなど
7. DI
    1. コンストラクタインジェクションが基本（Swiftと同じ）
    2. フィールドインジェクション（@Autowired）でプロパティに宣言することでもOK
       循環依存に注意
    3. interfaceの実装クラスに@Componentをつけることでインジェクションされる
    4. 複数実装クラス(@Component)がある場合は@Qualifierで実装するComponentを指定する
8. MyBatis(O/Rマッパー)
    1. MyBatisGenerator
        1. MyBatisで使用するMapper関連のものを自動生成する
        2. ※Gradleプラグインはメンテがついていけていないものもあるので注意
        3. generator用のConfigで指定したDB情報＋テーブル情報のファイルを自動作成してくれる
    2. mybatis-spring-boot-starter
        1. 通常に使うorg.mybatis:mybatisの代わりにうまくやってくれる
        2. mybatis-config.xmlは不要になり、application.yml(.properties)でDB情報を設定できるようになる
        3. 設定情報を元にセッション作成やコミットも自動で行ってくれる
    3. データの扱い方
        1. 呼び出し元でMapperをDIする
        2. interfaceメソッドを呼び出す
            1. selectByPrimaryKey -> Row?
            2. select { where } -> List<Row>
                1. where(key名, 比較関数(value))
            3. count { where }
                1. where(key名, 比較関数(value))
            4. insert(Row) -> Int
            5. insertMultiple(List) -> Int
            6. updateByPrimaryKeySelective(Row) -> Int
            7. update { set, where } -> Int
                1. set(key名).比較関数(value)：更新値
                2. where(key名, 比較関数(value))：条件
            8. update { updateSelectiveColumns, where }
                1. updateSelectiveColumns(List<Row>)：更新したリスト
                2. where(key名, 比較関数(value))
            9. deleteByPrimaryKey(Row)
            10. delete { where }
            1. where(key名, 比較関数(value))
g