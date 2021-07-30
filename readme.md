# 관통 프로젝트 README 😍 
# 프로젝트 명
     Happy House Project 🏠
    : 사용자의 행복한 집을 찾아주기 위한 프로젝트 

<br>

# 프로젝트 참여자
    - 이정훈
    - 김다빈

<br>

# 프로젝트 기능 설명
## 1. 기본 기능 😎
### 기능 정의
     주어진 XML 데이터를 파싱하여, 아파트, 주택 등의 매매/전/월세 필터링 하여 거래 정보를 리스트에 보여준다.

### 기능 상세
    - 아파트/주택 거래 정보 검색 및 조회
    - 건물 상세 정보 보기 (이미지, 빌딩 메타 정보)

        - 분류 필터
            - 아파트 / 주택
            - 매매 / 전, 월세

        - 검색 필터
            - 전체
            - 동
            - 아파트 이름

### 기능 접근 방법
    1. 메인 리스트에서 집 목록 보기.
    2. 화면 상단의 검색 기능을 이용해서 특정 거래 정보만 보기.

### 스크린샷

1. 전체 거래 정보 검색

     ![IMG/Untitled.png](IMG/Untitled.png)

2. 거래 정보 필터링 검색
    - 아파트/주택 별
        - 아파트 검색

            ![IMG/Untitled_1.png](IMG/Untitled_1.JPG)

        - 주택 검색

            ![IMG/Untitled_2.png](IMG/Untitled_2.JPG)
        
    - 매매/전,월세 별
        - 매매 검색

            ![IMG/Untitled_3.png](IMG/Untitled_3.png)

        - 전,월세 검색

            ![IMG/Untitled_4.png](IMG/Untitled_4.png)

    - 동/아파트 이름 별
        - "숭인" 동 검색

            ![IMG/Untitled_5.png](IMG/Untitled_5.png)

        - "아남1" 아파트 검색

            ![IMG/Untitled_6.png](IMG/Untitled_6.png)

<br>

# 2. 추가 기능 🥳
## 주변 지역 환경 공기오염 데이터 조회 기능 🌳

### 기능 정의
     리스트에서 선택한 아파트 거래 정보의 주변 (서울 지역구 단위) 에서, 환경 공기오염 데이터를 보여준다.

### 기능 상세
      - 그 지역에 해당하는 CSV 데이터를 파싱.
      - 파싱한 데이터의 정보를 팝업으로 나오는 창에 보여주기.

### 기능 접근 방법
     메인 리스트 → 목록 중 아무거나 클릭 → 왼쪽 상세 정보 버튼 클릭 → 팝업으로 나오는 리스트 중 상단 리스트.

### 관련 소스 (추가한 소스 목록)
     1. view/DetailView.java
        - 팝업 UI 관련 소스

     2. dto/AirInfo.java
        - 공기 오염 기본 데이터를 위한 클래스

     3. util/AirHandler.java
        util/DetailSAXParser.java
        - air.csv 파일에서 정보를 읽어 Parsing하는 Handler 클래스와 이를 활용하는 parser 클래스

     4. dao/DetailDao.java
        dao/DetailDaoImpl.java
        - 파일을 Paring하여 만들어진 AirInfo 객체에 데이터를 저장하고 관리

     5. service/DetailService.java
        service/DetailServiceImpl.java
        - search(String gu)를 호출하여 얻은 데이터를 리턴

### 특이사항
    - 선택한 아파트 거래 정보의 주변 (서울 지역구 단위) 에서 최신의 공기오염 데이터를 보여줍니다.
    - 현재 아파트 거래 정보가 종로구만 있기에 종로구만 볼 수 있습니다.

### 스크린샷
     아래 심화 기능의 스크린샷에 함께 첨부
     (상단 테이블)

<br>

# 3. 심화 기능
## 주변 지역 상가 정보 데이터 조회 기능 🏢

### 기능 정의
    - 리스트에서 선택한 아파트/주택 주변의 (법정동 단위) 상가 정보(편의점)를 보여주는 기능.

### 기능 상세
    - 그 지역에 해당하는 CSV 데이터를 파싱.
    - 파싱한 데이터의 정보를 팝업으로 나오는 창에 추가로 리스팅 해주기.

### 기능 접근 방법
     메인 리스트 → 목록 중 아무거나 클릭 → 왼쪽 상세 정보 버튼 클릭 → 팝업으로 나오는 리스트 중 하단 리스트.

### 관련 소스 (추가한 소스 목록)
     1. view/DetailView.java
        - 팝업 UI 관련 소스

     2. dto/MarketInfo.java
        - 상가 데이터를 위한 클래스

     3. util/MarketHandler.java
        util/DetailSAXParser.java
        - 종로구_편의점.csv 파일에서 정보를 읽어 Parsing하는 Handler 클래스와 이를 활용하는 parser 클래스

     4. dao/DetailDao.java
        dao/DetailDaoImpl.java
        - 파일을 Paring하여 만들어진 MarketInfo 객체에 데이터를 저장하고 관리

     5. service/DetailService.java
        service/DetailServiceImpl.java
        - search(String gu)를 호출하여 얻은 데이터를 리턴

### 특이사항
     원본(서울 지역 상권) 데이터가 너무 커서, 편의점 데이터만 추출하여 사용하였습니다.

### 스크린샷
     ![IMG/Untitled_8.png](IMG/Untitled_8.png)
