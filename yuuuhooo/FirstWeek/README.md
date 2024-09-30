# Android 1주차 WIL

> 🦊 유후/주영서(yuuuhooo) 작성

## Flatform & Layout
### ⭐️ Flatform
- 소프트웨어가 구동 가능한 하드웨어 아키텍처나 소프트웨어 프레임워크의 종류를 설명하는 단어. 컴퓨터의 아키텍쳐, 운영체제,  프로그래밍 언어, 런타임 라이브러리, GUI 등을 포함하는 말.

### ⭐️ Layout
- 앱에서 사용자 인터페이스의 구조를 정의

### ⭐️ Layout의 종류
1. <b>LinearLayout</b>

    - 가로 혹은 세로로 순차적으로 쌓아나가는 레이아웃.

    - android: orientation 속성값이 'horizonal'은 수평 배치, 'vertical'은 수직 배치.

2. <b>RelativeLayout</b>

    - 상대적으로 위치를 지정해주는 레이아웃.

    - 부모 뷰인 RelativeLayout을 기준으로 위치를 지정하거나 또 다른 자식 View의 위치를 기준으로 위치를 지정해줄 수 있음.

3. <b>ConstraintLayout</b>

    - RealativeLayout에 가중치를 추가하여 조금 더 발전 된 Layout.
    
    - 자식 View들에 제약을 주어 부모 View를 기준으로 위치를 지정하거나, 다른 View를 기준으로 위치를 지정할 수 있고, 각 View의 크기를 유연하게 지정할 수 있음.

    ***구글이 권장하는 레이아웃, xml 생성 시 기본적으로 적용되어 있음.***

4. <b>TableLayout</b>

    - View들을 표처럼 배치할 수 있는 레이아웃.
    - \<TableRow> 는 TableLayout의 행이 되고, TableRow 안에 들어가는 뷰들의 수 만큼 열이 생김.

5. <b>GridLayout</b>
    - TableLayout의 좀 더 발전된 형태로, TableLayout과 LinearLayout이 합쳐진 레이아웃.
    - android: orientation을 설정해 세로 배치 혹은 가로 배치를 설정해줄 수 있음.
    - rowCount, columnCount를 지정하면 정해진 수 만큼 뷰가 채워진 뒤 다음 행/열로 넘어가 뷰가 채워지게 됨.
    - 주로 갤러리 등과 같이 동일한 크기로 뷰를 나타낼 때 사용.

6. <b>FrameLayout</b>
    - 한 가지의 뷰를 보여줄 때 사용됨.
    - 여러 개의 뷰를 중첩시킬 수 있기 때문에 여러 개의 뷰를 중첩한 후 android: visivility를 설정하여 한 가지의 뷰만 visible 처리를 하여 보여주는 방식으로 사용함.
    - 그러나 ConstraintLayout을 이용하여 중첩 가능하기 때문에 잘 사용하진 않음.

#### 추가적인 레이아웃들
- **TabLayout**
    - Tab을 선택하여 화면 전환을 할 수 있도록 만든 Layout. 주 메뉴 안에서 보조 메뉴를 선택할 때 주로 사용됨.

- **CoordinatorLayout with CollapsingToolbarLayout, AppBarLayout**
    - FrameLayout 기반.
    - 스크롤 이벤트에 따라 상단 앱 바의 변화를 줄 때 사용.
    - 스크롤 시 화면을 차지하는 부분을 줄여 사용성을 개선함.

- **DrawerLayout**
    - 화면의 끝에서 가운데로 드래그 하여 나타내는 보조 레이아웃.
    - 최신 안드로이드에서는 제스쳐 효과 때문에 드래그 기능은 막고 특정 버튼을 통해 띄울 수 있도록 사용하기를 권장함.

### ⭐️ Gravity
- ***화면상의 뷰의 위치를 변경할 수 있는 속성***


- top: 상단에 배치
- bottom: 하단에 배치
- left: 왼쪽에 배치
- right: 오른쪽에 배치
- center: 가운데 배치
- center_vertical: 세로 축에서만 가운데, 가로 축은 가운데가 아닌 경우
- center_horizontal: 가로 축에서만 가운데, 세로 축은 가운데가 아닌 경우
- start: 부모 뷰그룹의 시작점에 배치
- end: 부모 뷰그룹의 마지막에 배치
- fill: 해당 위젯의 가로/세로 길이를 부모 뷰그룹의 사이즈에 맞게 늘려 채워줌
- fill_vertical: 세로를 부모 뷰 그룹의 사이즈에 맞게 늘려 채워줌
- fill_horizontal: 가로를 부모 뷰 그룹의 사이즈에 맞게 늘려 채워줌
- clip_vertical: 세로 길이가 부모 뷰 그룹보다 클 경우 넘어서는 부분을 잘라냄
- clip_horizontal: 가로 길이가 부모 뷰 그룹보다 클 경우 넘어서는 부분을 잘라냄