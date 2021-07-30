# 관통 프로젝트 Readme

## 특이사항
현재 앱이 시작될 때, 용량이 높은 파일을 쓰레드를 활용해 로딩 및 파싱하는 과정이 있습니다.
따라서, 처음 UI를 활용할 때 약간의 끊김이 있을 수 있습니다.

# 프로젝트 참여자

- 이정훈
- 김다빈

# 기본기능

### 기능 정의

주어진 XML 데이터를 파싱하여, 아파트, 주택 등의 매매/전/월세 필터링 하여 거래 정보를 리스트에 뿌려주는것.

### 기능 상세

- 기본 기능
    - 아파트/주택 거래 정보 검색 및 목록 보기.
        - 아파트/주택 별, 매매/전,월세 별 목록 보기.
        - 아파트, 동 , 매매/전 월세 검색.
        - 건물 상세 정보 보기 (이미지, 빌딩 메타 정보) 기능.

### 기능 접근 방법

1. 메인 리스트에서 목록 보기.
2. 화면 상단의 검색기능을 이용해서 특정 거래 정보만 보기.

## 스크린샷

- 전체 거래 정보 검색

    ![IMG/Untitled.png](IMG/Untitled.png)

- 거래 정보 필터링 검색
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

## 추가기능 - 1 : 상세정보 - 주변 지역 환경 지도점검 데이터.

### 기능 정의

리스트에서 선택한 아파트 거래 정보의 주변 (서울 지역구 단위) 에서, 환경 지도 점검 데이터가 있다면 보여주는 기능.

### 기능 상세

- 그 지역에 해당하는 CSV 데이터를 파싱.
    - 파싱한 데이터의 정보를 팝업으로 나오는 창에 추가로 리스팅 해주기.

### 기능 접근 방법

메인 리스트 → 목록 중 아무거나 클릭 → 왼쪽 상세 정보 버튼 클릭 → 팝업으로 나오는 리스트 중 **상단** 리스트.

### 관련 소스 (추가한 소스 목록)

- view/DetailView.java
    - 팝업 UI 관련 로직.
- dto/EnvironmentInfo.java
- dao/EnvironmentDao.java
- service/EnvironmentService.java
- util/CSVParser.java
    - csv 파싱 로직.

### 특이사항

- 환경 점검 데이터는 종로구만 ("창신동", "사직동", "숭인동", "무약동", "부암동") 존재하는것으로 가정하고 구현하였습니다.
- 다른구에 속한 데이터들은 나오지 않습니다.

### 스크린샷

- 종로구 외 결과

    ![IMG/Untitled_7.png](IMG/Untitled_7.png)

- 종로구 결과

    ![IMG/Untitled_8.png](IMG/Untitled_8.png)

## 추가 기능 - 2 : 상세정보 - 주변 지역 상가 정보 데이터.

### 기능 정의

- 리스트에서 선택한 아파트/주택 주변의 (서울 지역구 단위) 상가 정보를 보여주는 기능.

### 기능 상세

- 그 지역에 해당하는 CSV 데이터를 파싱.
    - 파싱한 데이터의 정보를 팝업으로 나오는 창에 추가로 리스팅 해주기.

### 기능 접근 방법

메인 리스트 → 목록 중 아무거나 클릭 → 왼쪽 상세 정보 버튼 클릭 → 팝업으로 나오는 리스트 중 **하단** 리스트.

### 관련 소스 (추가한 소스 목록)

- view/DetailView.java
    - 팝업 UI 관련 로직.
- dto/BuildingInfo.java
- dao/BuildingDao.java
- service/BuildingService.java
- util/CSVParser.java
    - csv 파싱 로직.
- dao/DataSource.java
    - 쓰레드를 활용하여 용량 높은 파일을 읽어오는 로직을 가진 싱글톤 파일.

### 특이사항

- 원본 (서울) 데이터가 너무 커서, 쓰레드를 활용하였습니다. 다만 모든 파싱이 처리될 때 까지 blocking이 있을 수 있어서, UI 속도가 초반에는 버벅일 수 있습니다..

### 스크린샷

![IMG/Untitled_8.png](IMG/Untitled_8.png)
