Feature: US011 As an administrator, I want to be able to access department details, update and delete department information via API connection. * The "(x)" sign at the end of the endpoint refers to the id data of the data to be processed.

  Scenario:US011---TC_01101 When a GET request body containing valid authorization information and required data (department id) is sent to the /api/departmentDetails endpoint, it should be verified that the status code returned is 200 and the message information is "success".


    Given Trendlifebuy APi user sets "api/departmentDetails" path parameters_ABD
    Then   departmanDetails get requestBody_ABD
    Then    sends a get departmandetails request_ABD
    And   status code 200 message success response body_ABD




         #***********************************************************TC01102**************************************************************
  @mst
  Scenario: US011---TC_01102 When a GET request body containing valid authorization information
  and required data (department id) is sent to the /api/departmentDetails endpoint,
  the data(id, name ,details, status, cerated_at, updated_at) in the returned response body should be verified.

        #/api/departmentDetails endpoint'ine gecerli authorization bilgileri ve gerekli verileri(department id) iceren bir GET request
            # body gönderildiginde dönen response body icerisindei datalar(id, name ,details, status, cerated_at, updated_at) dogrulanmali.

    Given Trendlifebuy APi user sets "api/departmentDetails" path parameters_ABD
    Then   departmanDetails get requestBody_ABD
    Then    sends a get departmandetails request_ABD
    * verify relavant fields are visible_abd
    # Then     verify  datala_ABD



  #***************************************************TC1103**********************************************************#


  Scenario:When a GET request body containing valid authorization information and wrong data (department id)
  is sent to the /api/departmentDetails endpoint, itshould be verified that the
  status code returned is 404 and the message information is "department not found".

    *  prepare the path parameters as "api/departmentDetails" _ABD
    *  the wrongdepartmentDetails requestBody _ABD
    *  save the departmentDetails response body_ABD
    * verify the returned status code is 404 _ABD
    * verify the information message is "department not found" _ABD






    #********************************************TC1104*******************************************************#


  Scenario: TC1104 When a PATCH request body containing valid authorization information
  and required data is sent to the /api/departmentUpdate/(x) endpoint, it should be verified that the status code returned is 202 and
  the message information in the response body is "department updated successfully".

    *  prepare the path parameters as "api/departmentUpdate/15" _ABD
    *  departmanUpdate requestBody _ABD
    * save the  departmanUpdate response body_ABD
    * verify the returned status code is 202 _ABD
    * verify the information message is "department updated successfully" _ABD
    # get post patch delete

  #* "GET" methoduyla body durumu 1 olan bir response kaydet

