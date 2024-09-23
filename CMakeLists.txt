cmake_minimum_required(VERSION 3.26)
set(PROJECT_NAME "CSAPP")
project(${PROJECT_NAME} C)
set(CMAKE_C_STANDARD 11)
set(SOURCE_DIR "code")
file(GLOB_RECURSE ALL_FILES "${SOURCE_DIR}/*")
set(SOURCES "")
set(HEADERS "")

# 遍历所有文件，将C文件添加到源文件列表，将头文件添加到头文件列表
foreach(FILE IN LISTS ALL_FILES)
    get_filename_component(FILE_EXT "${FILE}" EXT)
    if(FILE_EXT STREQUAL ".c")
        list(APPEND SOURCES "${FILE}")
    elseif(FILE_EXT STREQUAL ".h" OR FILE_EXT STREQUAL ".hpp")
        list(APPEND HEADERS "${FILE}")
    endif()
endforeach()


# 添加可执行文件
add_executable(${PROJECT_NAME} ${SOURCES} ${ALL_FILES})

# 设置包含目录
target_include_directories(${PROJECT_NAME} PRIVATE ${SOURCE_DIR})
