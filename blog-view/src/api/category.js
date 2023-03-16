import axios from '@/plugins/axios'

export function getBlogListByCategoryName(categoryName, pageNum) {
	return axios({
		url: 'category',
		method: 'GET',
		params: {
			categoryName,
			pageNum
		}
	})
}

// export function getCategoryList() {
// 	return axios({
// 		url: 'getCategory',
// 		method: 'GET',
// 	})
// }