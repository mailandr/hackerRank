/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */

const nums1 = [1,2,3];
const nums2 = [2,4];

var getCommon = function (nums1, nums2) {
    let uniqueArray1 = [...new Set(nums1)];
    let uniqueArray2 = [...new Set(nums2)];

    let mergedArr = uniqueArray1.concat(uniqueArray2);

    let filtered = mergedArr.filter((item,
        index) => mergedArr.indexOf(item) !== index);


    if (filtered.length > 0 ) {
        return filtered[0];
    } else {
        return -1;
    }
};

console.log(getCommon(nums1,nums2));